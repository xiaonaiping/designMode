package singletonMode;

/**
 * Created by wangxc on 2017/8/19 10:04.
 */
public class Singleton2 {
    //懒汉式单例
    private static Singleton2 singleton2;

    private Singleton2() {
    }


    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
