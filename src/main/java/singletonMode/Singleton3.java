package singletonMode;

/**
 * Created by wangxc on 2017/8/19 10:08.
 */
public class Singleton3 {
    //双重检测
    private volatile static Singleton3 singleton3;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }

}
