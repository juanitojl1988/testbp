package ec.test.bp.transactionsService.application.usecases;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import ec.test.bp.transactionsService.domain.model.dto.CustomerDto;
import ec.test.bp.transactionsService.domain.model.exception.ResourceNotFoundException;
import ec.test.bp.transactionsService.domain.model.exception.ResourceNotValidException;
import ec.test.bp.transactionsService.domain.port.in.CreateAccountUseCase;
import ec.test.bp.transactionsService.domain.port.out.AccountRepositoryPort;
import ec.test.bp.transactionsService.domain.port.out.ExternalServiceCustomerPort;
import ec.test.bp.transactionsService.infraestructure.entity.AccountEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

public class CreateAccountUseCaseImp implements CreateAccountUseCase {

    private static final Logger log = LoggerFactory.getLogger(CreateAccountUseCaseImp.class);
    private final AccountRepositoryPort accountRepositoryPort;
    private final ExternalServiceCustomerPort externalServiceCustomerPort;

    public CreateAccountUseCaseImp(AccountRepositoryPort accountRepositoryPort, ExternalServiceCustomerPort externalServiceCustomerPort) {
        this.accountRepositoryPort = accountRepositoryPort;
        this.externalServiceCustomerPort = externalServiceCustomerPort;
    }

    @Override
    public Mono<AccountDto> create(AccountResquestDto accountResquestDto) {
        return accountRepositoryPort.existAccountByNumAccount(accountResquestDto.getNumberAccount())
                .flatMap(exists -> {
                    log.info("Validate ifexist account");
                    if (!exists)
                        return externalServiceCustomerPort.getCustomerById(accountResquestDto.getCustomerId())
                                .flatMap(customerDto -> {
                                    accountResquestDto.setCustomerId(customerDto.getId());
                                    return accountRepositoryPort.create(accountResquestDto);
                                }).onErrorResume(e -> {
                                    log.error("No se puso completar la creacion, Detalle: " + e.getMessage());
                                    return Mono.error(new RuntimeException("No se pudo completar la operación"));
                                });
                    else
                        return Mono.error(new ResourceNotValidException("Account with number: " + accountResquestDto.getNumberAccount() + " exist and is active."));
                }).doOnError(error -> log.error("Erro general, Detalle: " + error.getMessage()));


    }
}
