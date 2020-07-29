package com.munjie.vue.myblog.utils;

import java.util.HashMap;

/** @Auther: munjie @Date: 7/27/2020 20:26 @Description: */
public class R extends HashMap<String, Object> {

  private static final long serialVersionUID = 1L;

  public R() {
    put("code", 200);
    put("reason", "SUCCESS");
    put("message", null);
  }

  public static R error() {
    return error(1, "操作失败");
  }

  public static R error(String msg) {
    return error(500, msg);
  }

  public static R error(int code, String msg) {
    R r = new R();
    r.put("code", code);
    r.put("message", msg);
    r.put("reason", null);
    return r;
  }

  public static R ok(String msg) {
    R r = new R();
    r.put("message", msg);
    return r;
  }

  public static R ok(Object object) {
    R r = new R();
    r.put("data", object);
    return r;
  }

  public static R ok(Object object, String message) {
    R r = new R();
    r.put("data", object);
    r.put("message", message);
    return r;
  }

  public static R ok() {
    R r = new R();
    r.put("code", 200);
    r.put("reason", "SUCCESS");
    r.put("message", null);
    return r;
  }

  @Override
  public R put(String key, Object value) {
    super.put(key, value);
    return this;
  }


  }

