package com.wxc.factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 15:08.
 */
public class HighEngineer implements Engineer {

    @Override
    public void run() {
        System.out.println("跑的快");
    }

    @Override
    public void start() {
        System.out.println("启动快");
    }
}
