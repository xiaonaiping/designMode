package factoryMode.factoryMethod.domain;

import factoryMode.simpleFactory.domain.*;
import factoryMode.simpleFactory.domain.AudiCar;

/**
 * Created by wangxc on 2017/8/19 14:07.
 */
public class AuDiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
