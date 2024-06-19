package ec.test.bp.customerService.infraestructure.adapter.repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ec.test.bp.customerService.infraestructure.adapter.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends   ReactiveCrudRepository<CustomerEntity, Long> {



}
