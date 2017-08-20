package com.wxc.factoryMode.factoryMethod;

import com.wxc.factoryMode.factoryMethod.domain.AuDiFactory;

/**
 * Created by wangxc on 2017/8/19 14:12.
 */
public class Client1 {
    public static void main(String[] args) {
        AuDiFactory auDiFactory = new AuDiFactory();
        auDiFactory.createCar().run();

    }
}
