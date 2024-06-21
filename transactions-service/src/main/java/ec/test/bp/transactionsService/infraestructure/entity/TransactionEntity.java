package ec.test.bp.transactionsService.infraestructure.entity;

import ec.test.bp.transactionsService.domain.model.constant.AcciontConstant;
import ec.test.bp.transactionsService.domain.model.constant.TransactionConstant;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Table(name = "transaction")
public class TransactionEntity {

    @Id
    @Column("id")
    private Long id;

    @Column("date_transaction")
    private Date dateTransaction;

    @Column("type_transaction")
    private TransactionConstant.TypeTransaction typeTransaction;

    @Column("value")
    private BigDecimal value;

    @Column("balance")
    private BigDecimal balance;

    @Column("state")
    private AcciontConstant.State state;
    
    @Transient
    private AccountEntity account;


}
