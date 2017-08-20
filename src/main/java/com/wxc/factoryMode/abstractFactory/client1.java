package com.wxc.factoryMode.abstractFactory;

import com.wxc.factoryMode.abstractFactory.domain.CarFactory;
import com.wxc.factoryMode.abstractFactory.domain.Engineer;
import com.wxc.factoryMode.abstractFactory.domain.HighCarFactory;

/**
 * Created by wangxc on 2017/8/19 14:44.
 */
public class client1 {
    public static void main(String[] args) {
        CarFactory highCarFactory = new HighCarFactory();
        Engineer highEngineer = highCarFactory.createEngineer();
        highEngineer.run();
        highEngineer.start();
    }
}
