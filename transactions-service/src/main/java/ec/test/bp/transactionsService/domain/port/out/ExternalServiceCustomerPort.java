package ec.test.bp.transactionsService.domain.port.out;

import ec.test.bp.transactionsService.domain.model.Customer;
import ec.test.bp.transactionsService.domain.model.dto.CustomerDto;
import reactor.core.publisher.Mono;

public interface ExternalServiceCustomerPort {

    Mono<CustomerDto> getCustomerById(Long id);

}
