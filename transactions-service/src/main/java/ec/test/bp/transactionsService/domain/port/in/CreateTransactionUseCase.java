package ec.test.bp.transactionsService.domain.port.in;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import ec.test.bp.transactionsService.domain.model.dto.CreateTransactionResquestDto;
import ec.test.bp.transactionsService.domain.model.dto.TransactionDto;
import reactor.core.publisher.Mono;

public interface CreateTransactionUseCase {

    Mono<TransactionDto> create(CreateTransactionResquestDto createTransactionResquestDto);

}
