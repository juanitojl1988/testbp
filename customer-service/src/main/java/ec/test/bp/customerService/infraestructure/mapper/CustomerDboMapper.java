package ec.test.bp.customerService.infraestructure.mapper;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.domain.model.dto.CustomerResquestDto;
import ec.test.bp.customerService.infraestructure.entity.CustomerEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
public interface CustomerDboMapper {



    @Mapping(source = "id", target = "id")
    @Mapping(source = "identification", target = "identification")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "gender", target = "gender")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "addresses", target = "addresses")
    @Mapping(source = "phone", target = "phone")

    CustomerDto toDbo(CustomerEntity customerEntity);

    @InheritInverseConfiguration
    CustomerEntity toDomain(CustomerDto customerDto);

    @InheritInverseConfiguration
    CustomerEntity toDomain1(CustomerResquestDto customerResquestDto);
}
