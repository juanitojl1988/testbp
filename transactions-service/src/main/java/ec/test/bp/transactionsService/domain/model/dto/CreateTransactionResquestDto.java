package ec.test.bp.transactionsService.domain.model.dto;

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

}
