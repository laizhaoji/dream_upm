package com.dream.upm.utils;

public class ResultMessage {

    private Boolean status;

    private String message;

    private Object data;

    public ResultMessage() {
    }

    public ResultMessage(Boolean status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResultMessage(Boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public static ResultMessage success(String message) {
        return new ResultMessage(true, message);
    }

    public static ResultMessage fail(String message) {
        return new ResultMessage(false, message);
    }

    public static ResultMessage success(String message, Object data) {
        return new ResultMessage(true, message, data);
    }

    public static ResultMessage fail(String message, Object data) {
        return new ResultMessage(false, message, data);
    }


    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
