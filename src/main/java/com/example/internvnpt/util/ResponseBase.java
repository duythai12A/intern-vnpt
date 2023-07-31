package com.example.internvnpt.util;

import lombok.Data;

@Data
public class ResponseBase {
    private Object[] results;
    private ResponseType responseType;
    private String errorCode;
    private String message;
    private String errorKey;

    public ResponseBase() {
    }

    public ResponseBase(Object[] results, ResponseType responseType, String message) {
        this.results = results;
        this.responseType = responseType;
        this.message = message;
    }

    public ResponseBase(Object[] results, ResponseType responseType, String errorCode, String message) {
        this.results = results;
        this.responseType = responseType;
        this.errorCode = errorCode;
        this.message = message;
    }

    public ResponseBase(Object[] results, ResponseType responseType, String errorCode, String message, String errorKey) {
        this.results = results;
        this.responseType = responseType;
        this.errorCode = errorCode;
        this.message = message;
        this.errorKey = errorKey;
    }
}
