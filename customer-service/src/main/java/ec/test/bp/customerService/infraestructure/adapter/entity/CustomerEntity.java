package ec.test.bp.customerService.infraestructure.adapter.entity;

import ec.test.bp.customerService.domain.model.constant.CustomerEnum;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity extends PersonEntity {


    private Long customerid;
    private CustomerEnum.State state;
    private String password;


}
