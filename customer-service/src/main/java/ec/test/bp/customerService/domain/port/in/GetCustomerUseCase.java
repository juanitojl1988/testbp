package ec.test.bp.customerService.domain.port.in;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import reactor.core.publisher.Mono;


public interface GetCustomerUseCase {


    Mono<CustomerDto> getById(Long id);

}
