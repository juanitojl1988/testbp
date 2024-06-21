package ec.test.bp.customerService.infraestructure.config;

import ec.test.bp.customerService.application.service.CustomerService;
import ec.test.bp.customerService.application.usecases.CreateCustomerUseCaseImp;
import ec.test.bp.customerService.application.usecases.GetCustomerUseCaseImp;
import ec.test.bp.customerService.domain.port.out.CustomerRepositoryPort;
import ec.test.bp.customerService.infraestructure.repository.JpaCustomerRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public CustomerService customerService(CustomerRepositoryPort customerRepositoryPort) {

        return new CustomerService(new GetCustomerUseCaseImp(customerRepositoryPort), new CreateCustomerUseCaseImp(customerRepositoryPort));

    }


    @Bean
    public CustomerRepositoryPort customerRepositoryPort(JpaCustomerRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

}
