package ec.test.bp.customerService.application.usecases;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface CustomerService {


    Mono<CustomerDto> create(CustomerResquest request);

    Mono<CustomerDto> getById(Long id);

    Flux<List<CustomerDto>> getAll();

    void deleteById(Long id);

    Mono<CustomerDto> update(CustomerResquest request, Long id);

}
