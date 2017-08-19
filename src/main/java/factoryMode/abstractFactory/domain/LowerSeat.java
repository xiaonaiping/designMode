package factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 15:12.
 */
public class LowerSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("按摩不舒服");
    }
}