package singletonMode;

/**
 * Created by wangxc on 2017/8/19 11:00.
 */
public class Client {
    public static void main(String[] args) {
        Singleton5 singleton1=Singleton5.INSTANCE;
        Singleton5 instance = Singleton5.INSTANCE;
        System.out.println(singleton1);
        System.out.println(instance);
    }
}
