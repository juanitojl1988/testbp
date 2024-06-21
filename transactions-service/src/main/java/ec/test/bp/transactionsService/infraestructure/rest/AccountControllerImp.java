package ec.test.bp.transactionsService.infraestructure.rest;

import ec.test.bp.transactionsService.application.service.AccountService;
import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
@Slf4j
@RestController
@RequestMapping("/api/account")
public class AccountControllerImp implements AccountController {
    private final AccountService accountService;

    public AccountControllerImp(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public Mono<ResponseEntity<AccountDto>> getAccountById(Long id) {
        log.info("getAccountById: Id={}", id);
        return accountService.getById(id).map(student -> {
            return new ResponseEntity<>(student, HttpStatus.OK);
        }).defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<AccountDto>> createAccount(AccountResquestDto accountResquestDto) {
        log.info("createAccount: {}", accountResquestDto);
        return accountService.create(accountResquestDto).map(student -> {
            return new ResponseEntity<>(student, HttpStatus.CREATED);
        });
    }
}
