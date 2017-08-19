package factoryMode.abstractFactory;

import factoryMode.abstractFactory.domain.CarFactory;
import factoryMode.abstractFactory.domain.Engineer;
import factoryMode.abstractFactory.domain.HighEngineer;

/**
 * Created by wangxc on 2017/8/19 14:44.
 */
public class client1 {
    public static void main(String[] args) {
        Engineer highEngineer = new HighEngineer();
        highEngineer.run();
        highEngineer.start();
    }
}
