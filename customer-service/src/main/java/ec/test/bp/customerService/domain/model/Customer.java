package ec.test.bp.customerService.domain.model;

import ec.test.bp.customerService.domain.model.constant.CustomerEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer extends  Person{

    private Long customerid;
    private CustomerEnum.State state;
    private String password;





}
