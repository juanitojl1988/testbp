package ec.test.bp.customerService.infraestructure.rest;

import ec.test.bp.customerService.application.service.CustomerService;
import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@Slf4j
@RestController
@RequestMapping("/api/customer/")
public class CustomerControllerImp implements CustomerController {

    private final CustomerService customerService;

    public CustomerControllerImp(CustomerService customerService) {
        this.customerService = customerService;
    }


    @Override
    public Mono<CustomerDto> getCostumerById(Long id) {
        return customerService.getById(id);
    }
}
