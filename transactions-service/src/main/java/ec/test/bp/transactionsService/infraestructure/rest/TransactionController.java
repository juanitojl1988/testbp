package ec.test.bp.transactionsService.infraestructure.rest;

import ec.test.bp.transactionsService.domain.model.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

public interface TransactionController {


    @GetMapping("/{id}")
    Mono<ResponseEntity<TransactionDto>> getTransactionById(@PathVariable("id") Long id);

    @PostMapping
    Mono<ResponseEntity<TransactionDto>> createTransaction(@RequestBody CreateTransactionResquestDto createTransactionResquestDto);

    @PutMapping("/{id}")
    Mono<ResponseEntity<TransactionDto>> updateTransaction(@PathVariable("id") Long id, @RequestBody UpdateTransactionResquestDto updateTransactionResquestDto);

    @DeleteMapping("/{id}")
    Mono<ResponseEntity> removeTransaction(@PathVariable("id") Long id);

    @GetMapping("/transactionsByCustomerAndDatesAndUser")
    Mono<ResponseEntity<TransactionDto>> getTransactionsForDatesAndUser(@RequestParam String dateStart, @RequestParam String dateEnd, @RequestParam Long customerId, @RequestParam int page, @RequestParam int size);


}
