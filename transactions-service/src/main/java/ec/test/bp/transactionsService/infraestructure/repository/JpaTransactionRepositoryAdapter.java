package ec.test.bp.transactionsService.infraestructure.repository;

import ec.test.bp.transactionsService.domain.model.dto.CreateTransactionResquestDto;
import ec.test.bp.transactionsService.domain.model.dto.TransactionDto;
import ec.test.bp.transactionsService.domain.port.out.TransactionRepositoryPort;
import ec.test.bp.transactionsService.infraestructure.mapper.AccountDboMapper;
import reactor.core.publisher.Mono;

public class JpaTransactionRepositoryAdapter implements TransactionRepositoryPort {


    private final JpaTransactionRepository jpaTransactionRepository;
    private final AccountDboMapper accountDboMapper;

    public JpaTransactionRepositoryAdapter(JpaTransactionRepository jpaTransactionRepository, AccountDboMapper accountDboMapper) {
        this.jpaTransactionRepository = jpaTransactionRepository;
        this.accountDboMapper = accountDboMapper;
    }


    @Override
    public Mono<TransactionDto> getById(Long id) {
        return null;
    }

    @Override
    public Mono<TransactionDto> create(CreateTransactionResquestDto createTransactionResquestDto) {
        return null;
    }
}
