package ec.test.bp.transactionsService.infraestructure.repository;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import ec.test.bp.transactionsService.domain.port.out.AccountRepositoryPort;
import reactor.core.publisher.Mono;

public class JpaAccountRepositoryAdapter implements AccountRepositoryPort {


    private final JpaAccountRepository jpaAccountRepository;

    public JpaAccountRepositoryAdapter(JpaAccountRepository jpaAccountRepository) {
        this.jpaAccountRepository = jpaAccountRepository;
    }

    @Override
    public Mono<AccountDto> getById(Long id) {
        return jpaAccountRepository.findById(id).flatMap(personE -> jpaCustomerRepository.findById(id).flatMap(customer -> {
            customer.setName(personE.getName());
            customer.setIdentification(personE.getIdentification());
            customer.setAge(personE.getAge());
            customer.setAddresses(personE.getAddresses());
            customer.setGender(personE.getGender());
            customer.setPhone(personE.getPhone());
            return Mono.just(customerDboMapper.toDbo(customer));
        })).switchIfEmpty(Mono.error(new CustomerNotFoundException("id", id.toString())));
    }

    @Override
    public Mono<AccountDto> create(AccountResquestDto accountResquestDto) {
        return null;
    }
}
