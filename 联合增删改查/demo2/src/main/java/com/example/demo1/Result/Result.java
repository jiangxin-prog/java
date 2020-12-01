package com.example.demo1.Result;

public class Result {

    String code;

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

    public Result(String code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    Object data;

    String message;


}
