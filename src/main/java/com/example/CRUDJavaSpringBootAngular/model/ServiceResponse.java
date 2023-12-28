package com.example.CRUDJavaSpringBootAngular.model;

import lombok.Data;

@Data
public class ServiceResponse {
    Boolean success;
    String message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
