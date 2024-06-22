package ec.test.bp.transactionsService.infraestructure.repository;

import ec.test.bp.transactionsService.infraestructure.entity.AccountEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface JpaAccountRepository extends ReactiveCrudRepository<AccountEntity, Long> {

    @Query("SELECT CASE WHEN COUNT(a) > 0 THEN TRUE ELSE FALSE END FROM account a WHERE a.number_account = :numberAccount AND a.state = 'A'")
    Mono<Boolean> existsByNumberAccountAndState(String numberAccount);

}
