package com.example.demo.common;

import javax.annotation.Resource;

public class Result {

    private static final String SUCCESS = "0";
    private static final String ERROR = "-1";

    private String code;  //返回的状态 成果或失败
    private String msg;  //报错信息等传值前台
    private Object data;

    //成功后
    //
    public static Result success(){
        Result result = new Result();
        result.setCode(SUCCESS);
        return result;
    }

    //传数据给前端
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(SUCCESS);
        result.setData(data);
        return result;
    }

    //error后传错误
    public static Result error(String msg){
        Result result = new Result();
        result.setCode(ERROR);
        result.setMsg(msg);
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
