package ec.test.bp.transactionsService.infraestructure.rest;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

public interface AccountController {

    @GetMapping("/{id}")
    Mono<ResponseEntity<AccountDto>> getAccountById(@PathVariable("id") Long id);

    @PostMapping
    Mono<ResponseEntity<AccountDto>> createAccount(@RequestBody AccountResquestDto accountResquestDto);

    @PutMapping("/{id}")
    Mono<ResponseEntity<AccountDto>> updateAccount(@PathVariable("id") Long id, @RequestBody AccountResquestDto accountResquestDto);

    @DeleteMapping("/{id}")
    Mono<ResponseEntity> removeAccount(@PathVariable("id") Long id);
}
