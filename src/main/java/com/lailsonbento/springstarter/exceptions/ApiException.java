package com.lailsonbento.springstarter.exceptions;

public class ApiException extends RuntimeException {
    public ApiException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public ApiException(String exMessage) {
        super(exMessage);
    }
}
