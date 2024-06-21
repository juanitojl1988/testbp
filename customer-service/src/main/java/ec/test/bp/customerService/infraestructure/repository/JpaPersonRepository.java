package ec.test.bp.customerService.infraestructure.repository;

import ec.test.bp.customerService.infraestructure.entity.CustomerEntity;
import ec.test.bp.customerService.infraestructure.entity.PersonEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPersonRepository extends ReactiveCrudRepository<PersonEntity, Long> {


}
