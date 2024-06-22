package ec.test.bp.transactionsService.domain.model.dto;

import ec.test.bp.transactionsService.domain.model.constant.AccountConstant;
import ec.test.bp.transactionsService.domain.model.constant.TransactionConstant;
import ec.test.bp.transactionsService.infraestructure.entity.AccountEntity;

import java.math.BigDecimal;
import java.util.Date;

public class UpdateTransactionResquestDto {


    private TransactionConstant.TypeTransaction typeTransaction;
    private BigDecimal value;
    private BigDecimal balance;
    private AccountConstant.State state;

}
