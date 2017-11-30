package com.example.examplle.constants;

//Created by Jim on 2017/11/29.
public interface Constants {
    //URL等放这里

    String COMMON_PATH = "测试url";
    interface URL{
        //测试数据
        String TEXT = COMMON_PATH + "拼接数据";
    }

    /**
     * 一些验证
     */
    interface Virify {
        //正则
    }

    /**
     * Intent传输数据的code
     */
    interface Code {
        public static int SEND_VIDEO = 1;
    }

    /**
     * 项目中的字符串常量
     */
    interface Strings {

        String ConnectionTimedOut = "服务器超时,请重试。";
        String VIDEO_URL = "video_Url";
        String VIDEO_FIRST_BITMAP = "first_bitmap";

    }

    /**
     * 整形常量
     */
    interface Integers {

    }

    /**
     * 三方API的key，ID
     */
    interface KeyStrings {

    }

    /**
     * 路径常量
     */
    interface Path {

    }

    /**
     * 测试接口
     */
    interface Test {


    }
}
