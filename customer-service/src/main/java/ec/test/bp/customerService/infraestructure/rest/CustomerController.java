package ec.test.bp.customerService.infraestructure.rest;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;

import ec.test.bp.customerService.domain.model.dto.CustomerResquestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


public interface CustomerController {



    @GetMapping("/{id}")
    Mono<ResponseEntity<CustomerDto>> getCostumerById(@PathVariable("id") Long id);

    @PostMapping
    Mono<ResponseEntity<CustomerDto>> createCustomer(@RequestBody CustomerResquestDto customerResquestDto);

}
