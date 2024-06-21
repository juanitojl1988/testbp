package ec.test.bp.transactionsService.domain.model.dto;

import ec.test.bp.transactionsService.domain.model.constant.AccountConstant;
import ec.test.bp.transactionsService.domain.model.constant.TransactionConstant;
import ec.test.bp.transactionsService.infraestructure.entity.AccountEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@Builder
public class TransactionDto {

    private Long id;
    private Date dateTransaction;
    private TransactionConstant.TypeTransaction typeTransaction;
    private BigDecimal value;
    private BigDecimal balance;
    private AccountConstant.State state;
    private AccountEntity account;


}
