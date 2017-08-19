package factoryMode.simpleFactory.domain;

/**
 * Created by wangxc on 2017/8/19 13:13.
 */
public class AudiCar implements Car {
    @Override
    public void run() {
        System.out.println("我的座驾是奥迪");
    }
}
