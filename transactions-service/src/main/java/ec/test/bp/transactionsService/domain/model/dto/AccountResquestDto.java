package ec.test.bp.transactionsService.domain.model.dto;

import ec.test.bp.transactionsService.domain.model.constant.AccountConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@Builder
public class AccountResquestDto {

    private String numberAccount;
    private AccountConstant.TypeAccount typeAccount;
    private BigDecimal initialBalance;
    private AccountConstant.State state;
    private Long customerId;

}
