package ec.test.bp.transactionsService.domain.model.exception;

import ec.test.bp.transactionsService.domain.model.constant.ResourceErrorEnum;

public class AccountNotFoundException extends ResourceNotFoundException{

    AccountNotFoundException(ResourceErrorEnum resourceErrorEnum, Object... args) {
        super(resourceErrorEnum, args);
    }
}
