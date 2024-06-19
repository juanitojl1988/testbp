package ec.test.bp.customerService.domain.port;

public interface CustomerPersistencePort {


    Flux<CompanyDto> getAllCompanies();

    Mono<CompanyDto> getCompanyById(UUID id);

    Mono<CompanyDto> addCompany(CompanyDto companyDto);

    Mono<CompanyDto> updateCompany(CompanyDto companyDto);

    Mono<CompanyDto> removeCompany(UUID id);

}
