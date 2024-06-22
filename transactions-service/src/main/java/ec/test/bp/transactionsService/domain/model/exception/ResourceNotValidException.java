package ec.test.bp.transactionsService.domain.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceNotValidException extends RuntimeException{

    public ResourceNotValidException(String message) {
        super(message);
    }

}
