package ec.test.bp.transactionsService.infraestructure.rest;

import ec.test.bp.transactionsService.domain.model.dto.CreateTransactionResquestDto;
import ec.test.bp.transactionsService.domain.model.dto.TransactionDto;
import ec.test.bp.transactionsService.domain.model.dto.UpdateTransactionResquestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@Slf4j
@RestController
@RequestMapping("/api/transaction")
public class TransactionControllerImp implements TransactionController{




    @Override
    public Mono<ResponseEntity<TransactionDto>> getTransactionById(Long id) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<TransactionDto>> createTransaction(CreateTransactionResquestDto createTransactionResquestDto) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<TransactionDto>> updateTransaction(Long id, UpdateTransactionResquestDto updateTransactionResquestDto) {
        return null;
    }

    @Override
    public Mono<ResponseEntity> removeTransaction(Long id) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<TransactionDto>> getTransactionsForDatesAndUser(String dateStart, String dateEnd, Long customerId, int page, int size) {
        return null;
    }
}
