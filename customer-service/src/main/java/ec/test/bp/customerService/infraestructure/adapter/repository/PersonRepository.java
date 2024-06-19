package ec.test.bp.customerService.infraestructure.adapter.repository;

import ec.test.bp.customerService.infraestructure.adapter.entity.PersonEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PersonRepository extends ReactiveCrudRepository<PersonEntity, Long> {

}
