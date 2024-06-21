package ec.test.bp.customerService.infraestructure.entity;

import ec.test.bp.customerService.domain.model.constant.PersonEnum;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Getter
@Setter
@Table(name = "person")
@Data
public   class PersonEntity  {

    @Id
    @Column("id")
    private Long id;
    @Column("identification")
    private String identification;
    @Column("name")
    private String name;
    @Column("gender")
    private PersonEnum.Gender gender;
    @Column("age")
    private int age;
    @Column("addresses")
    private String addresses;
    @Column("phone")
    private String phone;

    public PersonEntity() {}

    public PersonEntity(Long id, String identification, String name, PersonEnum.Gender gender, int age, String addresses, String phone) {
        this.id = id;
        this.identification = identification;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.addresses = addresses;
        this.phone = phone;
    }
}
