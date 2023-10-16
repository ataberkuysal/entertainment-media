package com.ata.entertainmentmedia.web.exceptions.custom_exceptions;

public class NoSuchSerieIdException extends RuntimeException{

    public NoSuchSerieIdException(String message) {
        super(message);
    }

    public NoSuchSerieIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
