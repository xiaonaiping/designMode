package com.wxc.factoryMode.simpleFactory;

import com.wxc.factoryMode.simpleFactory.domain.AudiCar;
import com.wxc.factoryMode.simpleFactory.domain.BydCar;
import com.wxc.factoryMode.simpleFactory.domain.Car;

/**
 * Created by wangxc on 2017/8/19 13:49.
 * 简单工厂类
 */
public class CarFactory {
    public Car createCar(String type) {
        if ("奥迪".equals(type)) {
            return new AudiCar();
        } else if ("比亚迪".equals(type)) {
            return new BydCar();
        }else{
            return null;
        }
    }
}
