package ec.test.bp.transactionsService.domain.model.dto;

import ec.test.bp.transactionsService.domain.model.constant.AcciontConstant;
import ec.test.bp.transactionsService.domain.model.constant.TransactionConstant;
import ec.test.bp.transactionsService.infraestructure.entity.AccountEntity;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionDto {

    private Long id;
    private Date dateTransaction;
    private TransactionConstant.TypeTransaction typeTransaction;
    private BigDecimal value;
    private BigDecimal balance;
    private AcciontConstant.State state;
    private AccountEntity account;


}
