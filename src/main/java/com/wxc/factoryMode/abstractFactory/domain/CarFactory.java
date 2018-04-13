package com.wxc.factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 14:53.
 */
public interface CarFactory {
    Engineer createEngineer();

    Tyre createTyre();

    Seat createSeat();
}
