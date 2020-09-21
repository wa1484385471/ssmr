package com.hp.boot.bean;

import java.io.Serializable;

/**
 * json数据格式 类
 */
public class JsonData implements Serializable {

    private int code;   //状态码  ， 0代表成功， -1代表失败
    private Object data;    //某个业务逻辑处理后的结果
    private String msg;//描述信息

    public JsonData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public JsonData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
