package ec.test.bp.customerService.infraestructure.adapter.entity;

import ec.test.bp.customerService.domain.model.constant.PersonEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "personas")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    private String identification;
    private String name;
    private PersonEnum.Gender gender;
    private int age;
    private String addresses;
    private String phone;


}
