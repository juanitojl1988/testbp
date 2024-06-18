package ec.test.bp.customerService.domain.model;

import ec.test.bp.customerService.domain.model.constant.PersonEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private Long personId;
    private String identification;
    private String name;
    private PersonEnum.Gender gender;
    private int age;
    private String addresses;
    private String phone;





}
