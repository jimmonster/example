package com.example.examplle.base;

import java.io.Serializable;

/**
 * Created by SCPC05 on 2017/4/11.
 */

public class BaseBean implements Serializable {

    /**
     * code : 1000
     * msg : 您输入的密码有误!
     * data : []
     */

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
