package ec.test.bp.transactionsService.infraestructure.repository;

import ec.test.bp.transactionsService.domain.model.constant.AccountConstant;
import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import ec.test.bp.transactionsService.domain.model.exception.AccountNotCreateException;
import ec.test.bp.transactionsService.domain.model.exception.AccountNotFoundException;
import ec.test.bp.transactionsService.domain.port.out.AccountRepositoryPort;
import ec.test.bp.transactionsService.infraestructure.entity.AccountEntity;
import ec.test.bp.transactionsService.infraestructure.mapper.AccountDboMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

import java.util.Date;

@Slf4j
@Component
public class JpaAccountRepositoryAdapter implements AccountRepositoryPort {


    private final JpaAccountRepository jpaAccountRepository;
    private final AccountDboMapper accountDboMapper;

    public JpaAccountRepositoryAdapter(JpaAccountRepository jpaAccountRepository, AccountDboMapper accountDboMapper) {
        this.jpaAccountRepository = jpaAccountRepository;
        this.accountDboMapper = accountDboMapper;
    }

    @Override
    public Mono<AccountDto> getById(Long id) {
        return jpaAccountRepository.findById(id)
                .flatMap(accountE -> {
                    return Mono.just(accountDboMapper.toDbo(accountE));
                }).switchIfEmpty(Mono.error(new AccountNotFoundException("id", id.toString())));
    }

    @Transactional
    @Override
    public Mono<AccountDto> create(AccountResquestDto accountResquestDto) {
        AccountEntity accountEntity = accountDboMapper.toDomain1(accountResquestDto);
        accountEntity.setDateCreate(new Date());
        accountEntity.setState(AccountConstant.State.A);
        return jpaAccountRepository.save(accountEntity)
                .flatMap(accountSaved -> {
                    return Mono.just(accountDboMapper.toDbo(accountSaved));
                }).onErrorResume(e -> {
                    log.error("Error al guardar, detalle:  " + e.toString());
                    return Mono.error(new AccountNotCreateException(e.getMessage()));
                });
    }

    @Override
    public Mono<Boolean> existAccountByNumAccount(String numAccount) {
       return jpaAccountRepository.existsByNumberAccountAndState(numAccount);
    }
}
