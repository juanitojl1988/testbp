package ec.test.bp.transactionsService.infraestructure.repository;

import ec.test.bp.transactionsService.infraestructure.entity.AccountEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAccountRepository extends ReactiveCrudRepository<AccountEntity, Long> {
}
