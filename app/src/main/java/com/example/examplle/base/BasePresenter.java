package com.example.examplle.base;

/**
 * Created by SCPC05 on 2017/4/5.
 */

public interface BasePresenter<T extends IBaseView> {

    void BasePresenter(T t);
    //绑定view，这个方法将会在activity中调用
    void attach(T mView);
    //解绑
    void dettach();
    //也就是activity的onResume(),presenter一般在这个方法里面做一些监听事件
    void onResume();

    void onCancle();


}
