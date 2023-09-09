/*
package com.ata.entertainmentmedia.utils;

import com.ata.entertainmentmedia.utils.custom_exceptions.NoSuchSerieIdException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class EntMediaExceptionHandler extends ResponseEntityExceptionHandler {

*/
/*    @ExceptionHandler(value
            = { IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity<Object> handleConflict(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "There is no such Serie with given serieId or no seriId is given";
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.CONFLICT, request);
    }*//*


    @ExceptionHandler(value = NoSuchSerieIdException.class)
    public ResponseEntity<NoSuchSerieIdException> resourceNotFoundException(NoSuchSerieIdException ex, WebRequest request) {

        ex.setMessage2("There is no such Serie with given serieId  " +
                " or " +
                "no seriId is given");

        return new ResponseEntity<NoSuchSerieIdException>(ex, HttpStatus.NOT_FOUND);
    }

}*/
