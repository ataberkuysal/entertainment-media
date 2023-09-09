package com.ata.entertainmentmedia.utils.custom_exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;

@Getter
@Setter
public class BaseException extends RuntimeException{


    private LocalDate date;
    private String message2;
    private RuntimeException e;

    public BaseException(LocalDate date, String message2,RuntimeException e) {
        this.date = date;
        this.message2 = message2;
        this.e = e;
    }

    public BaseException(RuntimeException e) {
        this.e = e;
    }

    public BaseException() {

    }



}
