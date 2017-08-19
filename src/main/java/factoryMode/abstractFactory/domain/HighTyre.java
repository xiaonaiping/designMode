package factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 15:12.
 */
public class HighTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("旋转不磨损");
    }
}