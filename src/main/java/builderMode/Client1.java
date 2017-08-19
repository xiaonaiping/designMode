package builderMode;

import builderMode.domain.AirShip;
import builderMode.domain.YellowAirShipBuilder;
import builderMode.domain.YellowAirShipDirector;

/**
 * Created by wangxc on 2017/8/19 15:44.
 */
public class Client1 {
    public static void main(String[] args) {
        YellowAirShipDirector yellowAirShipDirector = new YellowAirShipDirector(new YellowAirShipBuilder());
        AirShip airShip = yellowAirShipDirector.createAirShip();
        System.out.println("构建飞船成功");
    }
}
