package ec.test.bp.customerService.application.usecases;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.port.in.GetCustomerUseCase;
import ec.test.bp.customerService.domain.port.out.CustomerRepositoryPort;
import reactor.core.publisher.Mono;

public class GetCustomerUseCaseImp implements GetCustomerUseCase {

    private final CustomerRepositoryPort customerRepositoryPort;

    public GetCustomerUseCaseImp(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }


    @Override
    public Mono<CustomerDto> getById(Long id) {
        return Mono.empty();
    }
}
