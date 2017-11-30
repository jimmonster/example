package com.example.examplle.model;

import com.example.examplle.listener.MainPageListener;
import com.example.examplle.util.OkGoUtils;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.Map;

/**
 * 数据获取基类
 * Created by SCPC05 on 2017/7/18.
 */

public class BaseModel {

    //GET方法，不需要TAG
    public void doGet(String url, Map<String,String> paramMap, final MainPageListener listener){
        OkGoUtils.get(url, paramMap, new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                listener.success(response.body());
            }

            @Override
            public void onError(Response<String> response) {
                super.onError(response);
                listener.error(response.body());
            }
        });
    }

    //GET方法，需要TAG
    public void doGet(String url, Map<String,String> paramMap, Object tag, final MainPageListener listener){
        OkGoUtils.get(url, paramMap,tag, new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                listener.success(response.body());
            }

            @Override
            public void onError(Response<String> response) {
                super.onError(response);
                listener.error(response.body());
            }
        });
    }

    //post方法，不需要TAG
    public void doPost(String url, Map<String,String> paramMap, final MainPageListener listener){
        OkGoUtils.post(url, paramMap, new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                listener.success(response.body());
            }

            @Override
            public void onError(Response<String> response) {
                super.onError(response);
                listener.error(response.body());
            }
        });
    }

    //post方法，需要TAG
    public void doPost(String url, Map<String,String> paramMap, Object tag, final MainPageListener listener){
        OkGoUtils.post(url, paramMap,tag, new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                listener.success(response.body());
            }
            @Override
            public void onError(Response<String> response) {
                super.onError(response);
                listener.error(response.body());
            }
        });
    }
}
