package ec.test.bp.transactionsService.infraestructure.external;


import ec.test.bp.transactionsService.domain.model.Customer;
import ec.test.bp.transactionsService.domain.model.dto.CustomerDto;
import ec.test.bp.transactionsService.domain.port.out.ExternalServiceCustomerPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class RestCustomerService implements ExternalServiceCustomerPort {

    private final WebClient webClient;

    @Value("${customer.service.url}")
    private String url;

    public RestCustomerService() {
        this.webClient = WebClient.builder().baseUrl(url).build();
    }


    @Override
    public Mono<CustomerDto> getCustomerById(Long id) {
        log.info("Retrieving customer with id {}", id);
        String url = this.url + "/" + id;
        log.info("URL: {}", url);

        Mono<CustomerDto> customer = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(CustomerDto.class)
                .doOnNext(p -> log.info("Customer with id {} retrieved", id))
                .doOnError(e -> log.error("Error retrieving Customer with id {}", id, e));
        return customer;
    }
}
