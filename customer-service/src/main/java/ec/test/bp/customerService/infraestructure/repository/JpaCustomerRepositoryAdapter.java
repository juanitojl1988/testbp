package ec.test.bp.customerService.infraestructure.repository;


import ec.test.bp.customerService.domain.exception.CustomerNotCreateException;
import ec.test.bp.customerService.domain.exception.CustomerNotFoundException;
import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquestDto;
import ec.test.bp.customerService.domain.model.dto.PersonDto;
import ec.test.bp.customerService.domain.port.out.CustomerRepositoryPort;
import ec.test.bp.customerService.infraestructure.entity.CustomerEntity;
import ec.test.bp.customerService.infraestructure.entity.PersonEntity;
import ec.test.bp.customerService.infraestructure.mapper.CustomerDboMapper;
import ec.test.bp.customerService.infraestructure.mapper.PersonDboMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class JpaCustomerRepositoryAdapter implements CustomerRepositoryPort {


    private final JpaCustomerRepository jpaCustomerRepository;

    private final JpaPersonRepository jpaPersonRepository;
    private final CustomerDboMapper customerDboMapper;
    private final PersonDboMapper personDboMapper;

    public JpaCustomerRepositoryAdapter(JpaCustomerRepository jpaCustomerRepository, JpaPersonRepository jpaPersonRepository, CustomerDboMapper customerDboMapper, PersonDboMapper personDboMapper) {
        this.jpaCustomerRepository = jpaCustomerRepository;
        this.jpaPersonRepository = jpaPersonRepository;
        this.customerDboMapper = customerDboMapper;

        this.personDboMapper = personDboMapper;
    }


    @Override
    public Mono<CustomerDto> getById(Long id) {

        return jpaPersonRepository.findById(id).flatMap(personE -> jpaCustomerRepository.findById(id).flatMap(customer -> {
            customer.setName(personE.getName());
            customer.setIdentification(personE.getIdentification());
            customer.setAge(personE.getAge());
            customer.setAddresses(personE.getAddresses());
            customer.setGender(personE.getGender());
            customer.setPhone(personE.getPhone());
            return Mono.just(customerDboMapper.toDbo(customer));
        })).switchIfEmpty(Mono.error(new CustomerNotFoundException("id", id.toString())));


    }

    @Transactional
    @Override
    public Mono<CustomerDto> create(CustomerResquestDto crdto) {
        PersonDto personDto = new PersonDto(crdto.getName(), crdto.getIdentification(), crdto.getGender(), crdto.getAge(), crdto.getAddresses(), crdto.getPhone());
        CustomerEntity customerEntity = customerDboMapper.toDomain1(crdto);
        PersonEntity personEntity = personDboMapper.toDomain(personDto);

        return jpaPersonRepository.save(personEntity)
                .flatMap(savedPerson -> {
                    customerEntity.setId(savedPerson.getId());
                    return jpaCustomerRepository.save(customerEntity);
                }).onErrorResume(e -> {
                    e.printStackTrace();
                    System.out.println("Error: "+e.toString());
                    return Mono.error(new CustomerNotCreateException(e.getMessage()));}).
                then(Mono.just(customerDboMapper.toDbo(customerEntity)));


    }
}
