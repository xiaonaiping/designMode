package com.wxc.factoryMode.simpleFactory.domain;

/**
 * Created by wangxc on 2017/8/19 13:15.
 */
public class BydCar implements Car {
    @Override
    public void run() {
        System.out.println("我的座驾是比亚迪");
    }
}
