package ec.test.bp.customerService.infraestructure.adapter.mapper;


import ec.test.bp.customerService.domain.model.Customer;
import ec.test.bp.customerService.infraestructure.adapter.entity.CustomerEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerDboMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "completed", target = "completed")
    @Mapping(source = "dateOfCreation", target = "dateOfCreation")
    @Mapping(source = "timeRequiredToComplete", target = "timeRequiredToComplete")
    CustomerEntity toDbo(Customer domain);

    @InheritInverseConfiguration
    Customer toDomain(CustomerEntity entity);


}
