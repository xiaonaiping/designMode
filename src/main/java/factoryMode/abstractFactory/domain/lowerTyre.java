package factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 15:13.
 */
public class lowerTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("旋转磨损严重");
    }
}
