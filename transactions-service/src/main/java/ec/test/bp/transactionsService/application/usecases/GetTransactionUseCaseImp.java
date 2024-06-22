package ec.test.bp.transactionsService.application.usecases;

import ec.test.bp.transactionsService.domain.model.dto.TransactionDto;
import ec.test.bp.transactionsService.domain.port.in.GetTransactionUseCase;
import ec.test.bp.transactionsService.domain.port.out.AccountRepositoryPort;
import ec.test.bp.transactionsService.domain.port.out.TransactionRepositoryPort;
import reactor.core.publisher.Mono;

public class GetTransactionUseCaseImp implements GetTransactionUseCase {

    private final TransactionRepositoryPort transactionRepositoryPort;

    public GetTransactionUseCaseImp(TransactionRepositoryPort transactionRepositoryPort) {
        this.transactionRepositoryPort = transactionRepositoryPort;
    }

    @Override
    public Mono<TransactionDto> getById(Long id) {
        return transactionRepositoryPort.getById(id);
    }
}
