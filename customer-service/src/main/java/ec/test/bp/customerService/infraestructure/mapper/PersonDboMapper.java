package ec.test.bp.customerService.infraestructure.mapper;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.PersonDto;
import ec.test.bp.customerService.infraestructure.entity.CustomerEntity;
import ec.test.bp.customerService.infraestructure.entity.PersonEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonDboMapper {


    @Mapping(source = "id", target = "id")
    @Mapping(source = "identification", target = "identification")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "gender", target = "gender")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "addresses", target = "addresses")
    @Mapping(source = "phone", target = "phone")
    PersonDto toDbo(PersonEntity personEntity);

    @InheritInverseConfiguration
    PersonEntity toDomain(PersonDto personDto);
}
