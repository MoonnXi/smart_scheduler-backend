package org.example.smart_schedulerbackend.tools;

import lombok.Data;

@Data
public class ResponseResult<T> {
    private int code;
    private String message;
    private T data;

    public ResponseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseResult<T> success(String message, T data) {
        return new ResponseResult<T>(1, message, data);
    }

    public static <T> ResponseResult<T> fail(String message) {
        return new ResponseResult<T>(0, message, null);
    }
}
