package com.example.examplle.util;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import java.util.Map;

/**
 * OkGo二次封装网络工具
 * Created by zk on 2017/9/16.
 */

public  class OkGoUtils {


    //GET方法，不需要TAG
    public static void get(String url, Map<String,String> paramMap, StringCallback callback) {
        OkGo.<String>get(url).params(paramMap).params("dcbid",1).execute(callback);
    }

    //GET方法，需要传递TAG
    public static void get(String url, Map<String,String> paramMap, Object tag, StringCallback callback) {
        OkGo.<String>get(url).params(paramMap).params("dcbid",1).tag(tag).execute(callback);
    }

    //GET方法
    public static void get(String url, StringCallback callback) {
        OkGo.<String>get(url).params("dcbid",1).execute(callback);
    }

    //post，不需要传递TAG
    public static void post(String url, Map<String,String> paramMap, StringCallback callback) {
        OkGo.<String>post(url).params(paramMap).params("dcbid",1).execute(callback);
    }

    //post，需要传递TAG
    public static void post(String url, Map<String,String> paramMap, Object tag, StringCallback callback) {
        OkGo.<String>post(url).params(paramMap).params("dcbid",1).tag(tag).execute(callback);
    }





}
