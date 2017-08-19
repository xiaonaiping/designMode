package factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 14:50.
 */
public interface Tyre {
    void revolve();
}
class HighTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("旋转不磨损");
    }
}
class lowerTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("旋转磨损严重");
    }
}
