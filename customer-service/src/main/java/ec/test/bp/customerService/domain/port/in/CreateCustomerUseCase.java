package ec.test.bp.customerService.domain.port.in;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquestDto;
import reactor.core.publisher.Mono;

public interface CreateCustomerUseCase {

    Mono<CustomerDto> create(CustomerResquestDto customerResquestDto);
}
