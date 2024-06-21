package ec.test.bp.transactionsService.domain.model.dto;

import ec.test.bp.transactionsService.domain.model.constant.AcciontConstant;

import java.math.BigDecimal;

public class AccountResquestDto {

    private String numberAccount;
    private AcciontConstant.TypeAccount typeAccount;
    private BigDecimal initialBalance;
    private AcciontConstant.State state;
    private Long customerId;

}
