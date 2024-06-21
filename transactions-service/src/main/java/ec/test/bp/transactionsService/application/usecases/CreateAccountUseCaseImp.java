package ec.test.bp.transactionsService.application.usecases;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import ec.test.bp.transactionsService.domain.port.in.CreateAccountUseCase;
import ec.test.bp.transactionsService.domain.port.out.AccountRepositoryPort;
import reactor.core.publisher.Mono;

public class CreateAccountUseCaseImp implements CreateAccountUseCase {

    private final AccountRepositoryPort accountRepositoryPort;

    public CreateAccountUseCaseImp(AccountRepositoryPort accountRepositoryPort) {
        this.accountRepositoryPort = accountRepositoryPort;
    }

    @Override
    public Mono<AccountDto> create(AccountResquestDto accountResquestDto) {
        return this.accountRepositoryPort.create(accountResquestDto);
    }
}
