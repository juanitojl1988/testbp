package ec.test.bp.customerService.infraestructure.repository;



import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ec.test.bp.customerService.infraestructure.entity.CustomerEntity;

@Repository
public interface JpaCustomerRepository extends ReactiveCrudRepository<CustomerEntity, Long> {



}
