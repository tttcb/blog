package com.qilinger.blog.model;

import lombok.Data;

import java.util.Map;

@Data
public class Result {
    private ResultCode code;
    private String Msg;
    private String isSuccess;
    private Map data;
    public Result(){
    }
    public Result code(ResultCode resultcode) {
        this.code = resultcode;
        return this;
    }

    public Result message(String message) {
        this.Msg = message;
        return this;
    }
    public Result data(Map map) {
        this.data = map;
        return this;
    }
}
