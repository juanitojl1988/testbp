package ec.test.bp.customerService.infraestructure.rest;

import ec.test.bp.customerService.application.usecases.CustomerService;
import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class CustomerControllerImp implements CustomerController {

    private final CustomerService customerService;

    public CustomerControllerImp(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public Flux<CustomerDto> getCostumer() {
        return null;
    }

    @Override
    public Mono<CustomerDto> getCostumerById(Long id) {
        return customerService.getById(id);
    }

    @Override
    public Mono<CustomerDto> addCostumer(CustomerResquest customerResquest) {
        return null;
    }

    @Override
    public Mono<CustomerDto> updateCostumer(Long id, CustomerResquest customerResquest) {
        return null;
    }

    @Override
    public Mono<CustomerDto> removeCostumer(Long id) {
        return null;
    }
}
