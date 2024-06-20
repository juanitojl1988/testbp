package ec.test.bp.customerService.infraestructure.repository;


import ec.test.bp.customerService.domain.exception.CustomerNotFoundException;
import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.port.out.CustomerRepositoryPort;
import ec.test.bp.customerService.infraestructure.entity.CustomerEntity;
import ec.test.bp.customerService.infraestructure.mapper.CustomerDboMapper;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class JpaCustomerRepositoryAdapter implements CustomerRepositoryPort {


    private final JpaCustomerRepository jpaCustomerRepository;


    public JpaCustomerRepositoryAdapter(JpaCustomerRepository jpaCustomerRepository) {
        this.jpaCustomerRepository = jpaCustomerRepository;

    }

    @Override
    public Mono<CustomerDto> getById(Long id) {
        return jpaCustomerRepository.findById(id).
                switchIfEmpty(Mono.error(new CustomerNotFoundException("id", id.toString()))).
                map(CustomerDboMapper.INSTANCE::toDbo);
    }
}
