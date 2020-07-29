package com.munjie.vue.myblog.utils;

/**
 * @Auther: munjie
 * @Date: 7/26/2020 14:49
 * @Description:
 */


import java.io.Serializable;
import java.util.HashMap;

public class Response<T> extends HashMap<String, Object> implements Serializable  {

    private static final long serialVersionUID = -4505655308965878999L;

    //请求成功返回码为：0000
    private static final int successCode = 0;
    //返回数据
    private T data;
    //返回码
    private int statusCode;
    //返回描述


    private String message;

    private int total;

    private boolean  success;


    public Response() {
        put("statusCode", successCode);
        put("message", "成功");
        put("success",true);
    }

    public static Response ok(Object object,int total) {
        Response r = new Response();
        r.put("data", object);
        r.put("total", total);
        return r;
    }

    public static Response ok(Object object,String url) {
        Response r = new Response();
        r.put("data", object);
        r.put("url", url);
        return r;
    }

    public static Response ok(Object object) {
        Response r = new Response();
        r.put("data", object);
        return r;
    }

    public static Response ok() {
        Response r = new Response();
        return r;
    }

    public static Response error(String msg,int statusCode) {
        Response r = new Response();
        r.put("statusCode", statusCode);
        r.put("message", msg);
        r.put("success",false);
        return r;
    }


    public Response(T data) {
        this.data = data;
    }

    public Response(T data, int total) {
        this.data = data;
        this.total = total;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static int getSuccessCode() {
        return successCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public Response<T> put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
