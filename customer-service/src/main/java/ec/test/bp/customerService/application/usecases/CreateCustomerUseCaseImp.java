package ec.test.bp.customerService.application.usecases;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquestDto;
import ec.test.bp.customerService.domain.port.in.CreateCustomerUseCase;
import ec.test.bp.customerService.domain.port.out.CustomerRepositoryPort;
import reactor.core.publisher.Mono;

public class CreateCustomerUseCaseImp implements CreateCustomerUseCase {

    private final CustomerRepositoryPort customerRepositoryPort;

    public CreateCustomerUseCaseImp(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    public Mono<CustomerDto> create(CustomerResquestDto customerResquestDto) {
        return customerRepositoryPort.create(customerResquestDto);
    }
}
