package com.yk.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回结果类，服务端响应的数据最终都会封装成对象
 * @param <T>
 */
@Data
public class R<T> {
    private Integer code; //编码： 1成功， 0失败
    private String msg; //错误信息
    private T data; //数据
    private Map map = new HashMap(); //动态数据
    public static <T> R<T> success(T obejct) {
        R<T> r = new R<T>();
        r.data = obejct;
        r.code = 1;
        return  r;
    }
    public static <T> R<T> error(String msg) {
        R r = new R();
        r.msg = msg;
        r.code = 0;
        return r;
    }
    public R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }


}
