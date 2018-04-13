package com.wxc.singletonMode;

/**
 * Created by wangxc on 2017/8/19 10:21.
 */
public class Singleton4 {
    //静态内部类
    private static class SingletonClass {
        private static final Singleton4 singleton4 = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return SingletonClass.singleton4;
    }
}
