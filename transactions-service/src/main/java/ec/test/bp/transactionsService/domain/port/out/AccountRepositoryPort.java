package ec.test.bp.transactionsService.domain.port.out;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import reactor.core.publisher.Mono;

public  interface  AccountRepositoryPort {

    Mono<AccountDto> getById(Long id);
    Mono<AccountDto> create(AccountResquestDto accountResquestDto);
    Mono<Boolean> existAccountByNumAccount(String numAccount);
}
