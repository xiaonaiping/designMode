package factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 15:08.
 */
public class LowerEngineer implements Engineer {
    @Override
    public void run() {
        System.out.println("跑的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}
