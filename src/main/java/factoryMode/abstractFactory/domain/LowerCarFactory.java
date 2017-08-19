package factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 15:10.
 */
public class LowerCarFactory implements CarFactory{
    @Override
    public Engineer createEngineer() {
        return new LowerEngineer();
    }

    @Override
    public Tyre createTyre() {
        return new lowerTyre();
    }

    @Override
    public Seat createSeat() {
        return new LowerSeat();
    }
}