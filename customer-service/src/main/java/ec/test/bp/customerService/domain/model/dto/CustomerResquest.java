package ec.test.bp.customerService.domain.model.dto;

import ec.test.bp.customerService.domain.model.constant.PersonEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerResquest {

    private String identification;
    private String name;
    private PersonEnum.Gender gender;
    private int age;
    private String addresses;
    private String phone;


}
