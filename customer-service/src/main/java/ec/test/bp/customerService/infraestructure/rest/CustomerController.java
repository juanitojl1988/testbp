package ec.test.bp.customerService.infraestructure.rest;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


public interface CustomerController {



    @GetMapping("{id}")
    Mono<CustomerDto> getCostumerById(@PathVariable("id") Long id);

}
