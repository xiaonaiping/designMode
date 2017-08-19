package builderMode.domain;

import com.google.common.escape.Escaper;

/**
 * Created by wangxc on 2017/8/19 16:08.
 */
public class YellowAirShipBuilder implements AirShipBuilder {
    @Override
    public Engineer bulidEngineer() {
        return new Engineer("yellow牌发动机");
    }

    @Override
    public EscapeTower buildEscaper() {
        return new EscapeTower("yellow牌逃逸塔");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        return new OrbitalModule("yellow牌轨道舱");
    }
}
