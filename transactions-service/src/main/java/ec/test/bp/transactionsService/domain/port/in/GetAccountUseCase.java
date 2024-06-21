package ec.test.bp.transactionsService.domain.port.in;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import reactor.core.publisher.Mono;

public interface GetAccountUseCase {


    Mono<AccountDto> getById(Long id);
}
