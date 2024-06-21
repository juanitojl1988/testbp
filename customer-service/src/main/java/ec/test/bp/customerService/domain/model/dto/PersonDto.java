package ec.test.bp.customerService.domain.model.dto;

import ec.test.bp.customerService.domain.model.constant.CustomerEnum;
import ec.test.bp.customerService.domain.model.constant.PersonEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PersonDto {

    private Long id;
    private String identification;
    private String name;
    private PersonEnum.Gender gender;
    private int age;
    private String addresses;
    private String phone;

    public PersonDto(String name, String identification, PersonEnum.Gender gender, int age, String addresses, String phone) {
        this.name = name;

        this.identification = identification;
        this.gender = gender;
        this.age = age;
        this.addresses = addresses;
        this.phone = phone;
    }
}
