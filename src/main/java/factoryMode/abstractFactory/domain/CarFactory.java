package factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 14:53.
 */
public interface CarFactory {
    Engineer createEngineer();

    Tyre createTyre();

    Seat createSeat();
}
class HighCarFactory implements CarFactory{

    @Override
    public Engineer createEngineer() {
        return new HighEngineer();
    }

    @Override
    public Tyre createTyre() {
        return new HighTyre();
    }

    @Override
    public Seat createSeat() {
        return new HighSeat();
    }
}
class lowerCarFactory implements CarFactory{
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