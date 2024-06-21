package ec.test.bp.transactionsService.application.usecases;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import ec.test.bp.transactionsService.domain.port.in.GetAccountUseCase;
import ec.test.bp.transactionsService.domain.port.out.AccountRepositoryPort;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
public class GetAccountUseCaseImp implements GetAccountUseCase {

    private final AccountRepositoryPort accountRepositoryPort;

    public GetAccountUseCaseImp(AccountRepositoryPort accountRepositoryPort) {
        this.accountRepositoryPort = accountRepositoryPort;
    }

    @Override
    public Mono<AccountDto> getById(Long id) {
        return this.accountRepositoryPort.getById(id);
    }
}
