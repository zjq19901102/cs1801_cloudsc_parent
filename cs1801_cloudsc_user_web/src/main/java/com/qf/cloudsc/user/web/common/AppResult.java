package com.qf.cloudsc.user.web.common;

import java.io.Serializable;

//统一的返回的结果,必须序列化
public class AppResult implements Serializable {
    private boolean isSuccess;
    private String message;
    private Integer keycode;
    private Object data;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getKeycode() {
        return keycode;
    }

    public void setKeycode(Integer keycode) {
        this.keycode = keycode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public AppResult(boolean isSuccess, String message, Integer keycode, Object data) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.keycode = keycode;
        this.data = data;
    }

    public AppResult() {
    }
}
