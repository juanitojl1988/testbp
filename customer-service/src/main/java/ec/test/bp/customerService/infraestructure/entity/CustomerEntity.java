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
@Data
public class CustomerEntity  {

    @Id
    @Column("customerid")
    private Long customerid;
    @Column("state")
    private CustomerEnum.State state;
    @Column("password")
    private String password;


    public CustomerEntity(Long personId, String identification, String name, PersonEnum.Gender gender, int age, String addresses, String phone, Long customerid, CustomerEnum.State state, String password) {

        this.customerid = customerid;
        this.state = state;
        this.password = password;
    }
}
