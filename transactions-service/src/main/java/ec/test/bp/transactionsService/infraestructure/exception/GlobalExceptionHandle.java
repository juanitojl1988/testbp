package ec.test.bp.transactionsService.infraestructure.exception;

import ec.test.bp.transactionsService.domain.model.dto.ErrorDetailDTO;
import ec.test.bp.transactionsService.domain.model.exception.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandle extends ResponseEntityExceptionHandler {

    private String zoneId;

    public final Mono<ResponseEntity<ErrorDetailDTO>> handleResourceNotFoundException(Exception ex, ServerWebExchange exchange) {
        ErrorDetailDTO errorDetails = getErrorDetailVO(exchange, ex.getMessage(), ((ResourceNotFoundException) ex).getErrorCode(), this.zoneId);
        super.logger.error("handleResourceNotFoundException: " + errorDetails);
        return Mono.just(new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND));

    }

    private static ErrorDetailDTO getErrorDetailVO(ServerWebExchange ex, String errorMessage, String errorCode, String zoneId) {
        return ErrorDetailDTO.builder().erroDate(ZonedDateTime.now(TimeZone.getTimeZone(ZoneId.of(zoneId)).toZoneId()))
                .path(ex.getRequest().getPath().toString())
                .message(errorMessage)
                .errorcode(errorCode)
                .build();
    }

}
