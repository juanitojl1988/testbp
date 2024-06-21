package ec.test.bp.customerService.infraestructure.entity;

import ec.test.bp.customerService.domain.model.constant.CustomerEnum;
import ec.test.bp.customerService.domain.model.constant.PersonEnum;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table(name = "customer")
public class CustomerEntity extends  PersonEntity {


    @Column("state")
    private CustomerEnum.State state;
    @Column("password")
    private String password;

    public CustomerEntity() {}

    public CustomerEntity(Long personId, String identification, String name, PersonEnum.Gender gender, int age, String addresses, String phone) {
        super(personId, identification, name, gender, age, addresses, phone);
    }
}
