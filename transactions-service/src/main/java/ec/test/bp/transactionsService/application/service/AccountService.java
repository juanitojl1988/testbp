package ec.test.bp.transactionsService.application.service;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import ec.test.bp.transactionsService.domain.port.in.CreateAccountUseCase;
import ec.test.bp.transactionsService.domain.port.in.GetAccountUseCase;
import reactor.core.publisher.Mono;

public class AccountService  implements GetAccountUseCase,CreateAccountUseCase {
    private final GetAccountUseCase getAccountUseCase;
    private final CreateAccountUseCase createAccountUseCase;

    public AccountService(GetAccountUseCase getAccountUseCase, CreateAccountUseCase createAccountUseCase) {
        this.getAccountUseCase = getAccountUseCase;
        this.createAccountUseCase = createAccountUseCase;
    }

    @Override
    public Mono<AccountDto> getById(Long id) {
        return getAccountUseCase.getById(id);
    }

    @Override
    public Mono<AccountDto> create(AccountResquestDto accountResquestDto) {
        return createAccountUseCase.create(accountResquestDto);
    }
}
