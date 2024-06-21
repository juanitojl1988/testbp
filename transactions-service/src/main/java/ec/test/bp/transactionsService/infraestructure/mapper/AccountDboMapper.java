package ec.test.bp.transactionsService.infraestructure.mapper;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.domain.model.dto.AccountResquestDto;
import ec.test.bp.transactionsService.infraestructure.entity.AccountEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountDboMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "numberAccount", target = "numberAccount")
    @Mapping(source = "typeAccount", target = "typeAccount")
    @Mapping(source = "initialBalance", target = "initialBalance")
    @Mapping(source = "state", target = "state")
    @Mapping(source = "dateCreate", target = "dateCreate")
    AccountDto toDbo(AccountEntity accountEntity);

    @InheritInverseConfiguration
    AccountEntity toDomain(AccountDto accountDto);

    @InheritInverseConfiguration
    AccountEntity toDomain1(AccountResquestDto accountResquestDto);
}
