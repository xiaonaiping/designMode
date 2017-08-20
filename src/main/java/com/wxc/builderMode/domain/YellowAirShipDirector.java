package com.wxc.builderMode.domain;

/**
 * Created by wangxc on 2017/8/19 17:11.
 */
public class YellowAirShipDirector implements AirShipDirector {
    private YellowAirShipBuilder airShipBuilder;

    public YellowAirShipDirector(YellowAirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip createAirShip() {
        EscapeTower escapeTower = airShipBuilder.buildEscaper();
        OrbitalModule orbitalModule = airShipBuilder.buildOrbitalModule();
        Engineer engineer = airShipBuilder.bulidEngineer();
        AirShip airShip = new AirShip(orbitalModule, engineer, escapeTower);
        return airShip;
    }
}
