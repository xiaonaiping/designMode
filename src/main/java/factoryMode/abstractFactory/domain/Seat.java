package factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 14:47.
 */
public interface Seat {
    //按摩
    void massage();
}

class HighSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("按摩舒服");
    }
}

class LowerSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("按摩不舒服");
    }
}

