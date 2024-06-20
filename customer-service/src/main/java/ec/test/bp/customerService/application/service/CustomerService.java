package ec.test.bp.customerService.application.service;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.port.in.GetCustomerUseCase;
import reactor.core.publisher.Mono;


public class CustomerService implements GetCustomerUseCase {

    private final GetCustomerUseCase getCustomerUseCase;

    public CustomerService(GetCustomerUseCase getCustomerUseCase) {
        this.getCustomerUseCase = getCustomerUseCase;
    }


    @Override
    public Mono<CustomerDto> getById(Long id) {
        return getCustomerUseCase.getById(id);
    }
}
