package builderMode.domain;

import com.google.common.escape.Escaper;

/**
 * Created by wangxc on 2017/8/19 15:46.
 */
public interface AirShipBuilder {
    Engineer bulidEngineer();

    EscapeTower buildEscaper();

    OrbitalModule buildOrbitalModule();
}
