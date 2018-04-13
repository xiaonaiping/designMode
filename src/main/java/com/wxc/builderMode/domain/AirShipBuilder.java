package com.wxc.builderMode.domain;

/**
 * Created by wangxc on 2017/8/19 15:46.
 */
public interface AirShipBuilder {
    Engineer bulidEngineer();

    EscapeTower buildEscaper();

    OrbitalModule buildOrbitalModule();
}
