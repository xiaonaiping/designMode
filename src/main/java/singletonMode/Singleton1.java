package singletonMode;

import domain.Person;

/**
 * Created by wangxc on 2017/8/19 10:01.
 */
public class Singleton1 {
    //恶汉式单例
    private static /*final*/ Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
