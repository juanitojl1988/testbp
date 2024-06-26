package ec.test.bp.customerService.domain.model.dto;

import ec.test.bp.customerService.domain.model.constant.CustomerEnum;
import ec.test.bp.customerService.domain.model.constant.PersonEnum;
import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class CustomerDto {

    private Long id;
    private String identification;
    private String name;
    private PersonEnum.Gender gender;
    private int age;
    private String addresses;
    private String phone;
    private String password;
    private CustomerEnum.State state;

    public CustomerDto() {

    }
}
