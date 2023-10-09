package com.ata.entertainmentmedia.web.exceptions;

import com.ata.entertainmentmedia.utils.logging.Log;
import com.ata.entertainmentmedia.web.exceptions.custom_exceptions.NoSuchSerieIdBody;
import com.ata.entertainmentmedia.web.exceptions.custom_exceptions.NoSuchSerieIdException;
import org.springframework.http.*;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

/*    @ExceptionHandler(NoSuchSerieIdException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<NoSuchSerieIdException> handleAllUncaughtException(
            Exception exception,
            NoSuchSerieIdException body, HttpHeaders httpHeaders,HttpStatus status) {

        return new ResponseEntity<>(body,httpHeaders,status);


    }*/

    @ExceptionHandler(value = {NoSuchSerieIdException.class})
    @Log
    public ResponseEntity<Object> handleNoSuchSerieIdException(NoSuchSerieIdException e) {

        HttpStatus badRequest = HttpStatus.BAD_REQUEST;

        NoSuchSerieIdBody noSuchSerieIdBody = new NoSuchSerieIdBody(
                e.getMessage(),
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z"))
        );

        return ResponseEntity.status(badRequest).body(noSuchSerieIdBody);

    }
}
