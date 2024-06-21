package ec.test.bp.transactionsService.infraestructure.mapper;

import ec.test.bp.transactionsService.domain.model.dto.AccountDto;
import ec.test.bp.transactionsService.infraestructure.entity.AccountEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountDboMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "identification", target = "identification")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "gender", target = "gender")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "addresses", target = "addresses")
    @Mapping(source = "phone", target = "phone")
    AccountDto toDbo(AccountEntity accountEntity);

    @InheritInverseConfiguration
    AccountEntity toDomain(AccountDto accountDto);
}
