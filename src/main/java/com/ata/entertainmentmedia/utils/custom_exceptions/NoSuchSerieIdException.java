package com.ata.entertainmentmedia.utils.custom_exceptions;

public class NoSuchSerieIdException extends BaseException{

    public NoSuchSerieIdException(RuntimeException e) {
        super(e);
    }
    public NoSuchSerieIdException() {}

}
