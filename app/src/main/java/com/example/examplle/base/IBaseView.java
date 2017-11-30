package com.example.examplle.base;


import com.example.examplle.eum.LoadingType;

/**
 * Created by SCPC05 on 2017/7/14.
 */

public interface IBaseView<T extends BaseBean> {

     void loadBegin(LoadingType type);

     void loadSuccess(T t);

     void loadError(String msg);

     void loadFinish(LoadingType type);

}
