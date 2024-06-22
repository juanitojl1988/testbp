package ec.test.bp.transactionsService.domain.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.net.URI;
import java.time.ZonedDateTime;

@Data
@Builder
public class ErrorDetailDTO {
    public final ZonedDateTime erroDate;
    private final String path;
    private final String message;
    private final String errorcode;

}
