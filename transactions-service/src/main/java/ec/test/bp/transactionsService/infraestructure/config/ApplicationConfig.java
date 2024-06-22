package ec.test.bp.transactionsService.infraestructure.config;

import ec.test.bp.transactionsService.application.service.AccountService;
import ec.test.bp.transactionsService.application.usecases.CreateAccountUseCaseImp;
import ec.test.bp.transactionsService.application.usecases.GetAccountUseCaseImp;
import ec.test.bp.transactionsService.domain.port.out.AccountRepositoryPort;
import ec.test.bp.transactionsService.domain.port.out.ExternalServiceCustomerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public AccountService accountService(AccountRepositoryPort customerRepositoryPort, ExternalServiceCustomerPort externalServiceCustomerPort) {

        return new AccountService(
                new GetAccountUseCaseImp(customerRepositoryPort),
                new CreateAccountUseCaseImp(customerRepositoryPort,externalServiceCustomerPort));

    }

//    @Bean
//    public AccountRepositoryPort accountRepositoryPort(JpaAccountRepositoryAdapter jpaAccountRepositoryAdapter) {
//        return jpaAccountRepositoryAdapter;
//    }

}
