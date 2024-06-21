package ec.test.bp.transactionsService.infraestructure.mapper.rest;

import ec.test.bp.transactionsService.application.service.AccountService;
import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;

public interface AccountController {

    @GetMapping("/{id}")
    Mono<ResponseEntity<AccountDto>> getCostumerById(@PathVariable("id") Long id);

    @PostMapping
    Mono<ResponseEntity<AccountDto>> createCustomer(@RequestBody AccountResquestDto accountResquestDto);

}
