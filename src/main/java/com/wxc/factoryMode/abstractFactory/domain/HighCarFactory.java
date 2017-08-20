package com.wxc.factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 15:09.
 */
public class HighCarFactory implements CarFactory{
    @Override
    public Engineer createEngineer() {
        return new HighEngineer();
    }

    @Override
    public Tyre createTyre() {
        return new HighTyre();
    }

    @Override
    public Seat createSeat() {
        return new HighSeat();
    }
}
