package ec.test.bp.transactionsService.infraestructure.repository;

import ec.test.bp.transactionsService.infraestructure.entity.AccountEntity;
import ec.test.bp.transactionsService.infraestructure.entity.TransactionEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTransactionRepository extends ReactiveCrudRepository<TransactionEntity, Long> {




}
