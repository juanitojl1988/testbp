package ec.test.bp.transactionsService.domain.model.dto;

import ec.test.bp.transactionsService.domain.model.constant.AccountConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@Builder
public class CreateTransactionResquestDto {

    private String numberAccount;
    private Long customerId;
    private BigDecimal withdrawnAmount;
    private AccountConstant.TypeAccount typeAccount;

}
