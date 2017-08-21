package com.wxc.adaptorMode;

/**
 * Created by wangxc on 2017/8/21/021 19:04.
 * 适配器（要实现目标接口，具有目标接口功能）类适配器
 */
public class Adaptor extends Adaptee implements Target {
    @Override
    public void handle() {
        fun();//可以使用打字功能
    }
}
