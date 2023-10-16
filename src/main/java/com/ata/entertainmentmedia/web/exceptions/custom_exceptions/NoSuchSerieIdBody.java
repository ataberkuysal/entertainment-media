package com.ata.entertainmentmedia.web.exceptions.custom_exceptions;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class NoSuchSerieIdBody {

    private final String message;

    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;


    public NoSuchSerieIdBody(String message, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.zonedDateTime = zonedDateTime;
    }

    // GETTERS


    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }
}
