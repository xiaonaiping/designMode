package factoryMode.factoryMethod.domain;

import factoryMode.simpleFactory.domain.*;
import factoryMode.simpleFactory.domain.BydCar;

/**
 * Created by wangxc on 2017/8/19 14:08.
 */
public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BydCar();
    }
}
