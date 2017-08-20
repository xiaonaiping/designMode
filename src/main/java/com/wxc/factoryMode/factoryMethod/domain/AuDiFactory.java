package com.wxc.factoryMode.factoryMethod.domain;

import com.wxc.factoryMode.simpleFactory.domain.*;
import com.wxc.factoryMode.simpleFactory.domain.AudiCar;

/**
 * Created by wangxc on 2017/8/19 14:07.
 */
public class AuDiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
