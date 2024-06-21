package ec.test.bp.transactionsService.domain.model.dto;

import ec.test.bp.transactionsService.domain.model.constant.AcciontConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@Builder
public class AccountDto {

    private Long id;
    private String numberAccount;
    private AcciontConstant.TypeAccount typeAccount;
    private BigDecimal initialBalance;
    private AcciontConstant.State state;
    private Long customerId;
}
