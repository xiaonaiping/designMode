package com.wxc.adaptorMode;

/**
 * Created by wangxc on 2017/8/21/021 18:48.
 * 被适配器（键盘，但是没有usb接口）
 */
public class Adaptee {
    public void fun() {//功能
        System.out.println("打字功能");
    }
}
