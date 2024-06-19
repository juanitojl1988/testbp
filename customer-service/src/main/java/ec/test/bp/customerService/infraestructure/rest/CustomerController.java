package ec.test.bp.customerService.infraestructure.rest;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



public interface CustomerController {

    @GetMapping("/costumer")
    Flux<CustomerDto> getCostumer();

    @GetMapping("/costumer/{id}")
    Mono<CustomerDto> getCostumerById(@PathVariable("id") Long id);

    @PostMapping("/costumer")
    Mono<CustomerDto> addCostumer(@RequestBody CustomerResquest customerResquest);

    @PutMapping("/costumer/{id}")
    Mono<CustomerDto> updateCostumer(@PathVariable("id") Long id, @RequestBody CustomerResquest customerResquest);

    @DeleteMapping("/costumer/{id}")
    Mono<CustomerDto> removeCostumer(@PathVariable("id") Long id);
}
