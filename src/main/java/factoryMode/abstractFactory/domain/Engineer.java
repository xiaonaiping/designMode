package factoryMode.abstractFactory.domain;

/**
 * Created by wangxc on 2017/8/19 14:44.
 */
public interface Engineer {
    public void run();

    public void start();
}

class HighEngineer implements Engineer {

    @Override
    public void run() {
        System.out.println("跑的快");
    }

    @Override
    public void start() {
        System.out.println("启动快");
    }
}

class LowerEngineer implements Engineer {
    @Override
    public void run() {
        System.out.println("跑的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}
