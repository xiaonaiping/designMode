package singletonMode;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Created by wangxc on 2017/8/19 11:22.
 * 单例模式破解
 */
public class Client2{
    public static void main(String[] args) throws Exception {
        //反射方法破解
        Class<Singleton1> clazz= (Class<Singleton1>) Class.forName("singletonMode.Singleton1");
        Constructor<Singleton1> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Singleton1 singleton1 = c.newInstance();
        Singleton1 singleton = c.newInstance();
        System.out.println(singleton1);
        System.out.println(singleton);
        //序列化反序列化方式破解
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\objsdsas.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(singleton1);

        FileInputStream fileInputStream=new FileInputStream("D:\\objsdsas.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Singleton1 s= (Singleton1) objectInputStream.readObject();
        System.out.println(s);
    }
}
