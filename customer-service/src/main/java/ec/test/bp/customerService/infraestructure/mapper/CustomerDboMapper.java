package ec.test.bp.customerService.infraestructure.mapper;

import ec.test.bp.customerService.domain.model.dto.CustomerDto;
import ec.test.bp.customerService.infraestructure.entity.CustomerEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


@Mapper
public interface CustomerDboMapper {


    CustomerDboMapper INSTANCE = Mappers.getMapper(CustomerDboMapper.class);

    CustomerDto toDbo(CustomerEntity customerEntity);

    @InheritInverseConfiguration
    CustomerEntity toDomain(CustomerDto customerDto);


}
