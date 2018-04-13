package com.wxc.factoryMode.factoryMethod.domain;

import com.wxc.factoryMode.simpleFactory.domain.Car;

/**
 * Created by wangxc on 2017/8/19 13:12.
 */
public interface CarFactory {
    Car createCar();
}
