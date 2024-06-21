package ec.test.bp.customerService.application.service;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquestDto;
import ec.test.bp.customerService.domain.port.in.CreateCustomerUseCase;
import ec.test.bp.customerService.domain.port.in.GetCustomerUseCase;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
public class CustomerService implements GetCustomerUseCase, CreateCustomerUseCase {

    private final GetCustomerUseCase getCustomerUseCase;
    private final CreateCustomerUseCase createCustomerUseCase;

    public CustomerService(GetCustomerUseCase getCustomerUseCase, CreateCustomerUseCase createCustomerUseCase) {
        this.getCustomerUseCase = getCustomerUseCase;
        this.createCustomerUseCase = createCustomerUseCase;
    }


    @Override
    public Mono<CustomerDto> getById(Long id) {


        return getCustomerUseCase.getById(id);
    }

    @Override
    public Mono<CustomerDto> create(CustomerResquestDto customerResquestDto) {
       return createCustomerUseCase.create(customerResquestDto);
    }
}
