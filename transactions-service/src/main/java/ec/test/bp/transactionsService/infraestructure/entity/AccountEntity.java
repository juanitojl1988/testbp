package ec.test.bp.transactionsService.infraestructure.entity;

import ec.test.bp.transactionsService.domain.model.constant.AccountConstant;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Table(name = "account")
public class AccountEntity {

    @Id
    @Column("id")
    private Long id;

    @Column("number_account")
    private String numberAccount;

    @Column("type_account")
    private AccountConstant.TypeAccount typeAccount;

    @Column("initial_balance")
    private BigDecimal initialBalance;

    @Column("state")
    private AccountConstant.State state;

    @Column("customer_id")
    private Long customerId;

    @Column("date_create")
    private Date dateCreate;

}
