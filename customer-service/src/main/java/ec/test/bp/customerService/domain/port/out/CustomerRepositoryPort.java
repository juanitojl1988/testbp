package ec.test.bp.customerService.domain.port.out;

import ec.test.bp.customerService.domain.model.Customer;
import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquestDto;
import ec.test.bp.customerService.infraestructure.entity.CustomerEntity;
import reactor.core.publisher.Mono;

public interface CustomerRepositoryPort {


    Mono<CustomerDto> getById(Long id);

    Mono<CustomerDto> create(CustomerResquestDto customerResquestDto);



}
