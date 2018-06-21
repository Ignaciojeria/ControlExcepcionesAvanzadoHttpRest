package com.exce.exception.message;

public class ErrorMessage {

    private String exception;

    private String message;

    private String path;

    public ErrorMessage(Exception exception, String path){
        this(exception.getClass().getSimpleName(),exception.getMessage(),path);
    }

    private ErrorMessage(String exception, String message, String path) {
        this.exception = exception;
        this.message = message;
        this.path = path;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
