package com.wxc.adaptorMode;

/**
 * Created by wangxc on 2017/8/21/021 19:17.
 * 组合的方式
 */
public class Adaptor2 implements Target {
    private Adaptee adaptee;

    public Adaptor2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handle() {
        adaptee.fun();
    }
}
