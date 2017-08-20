package com.wxc.prototypeMode;

import java.io.*;
import java.util.Date;

/**
 * Created by wangxc on 2017/8/20/020 21:42.
 * 使用序列化和反序列化方式实现深复制
 */
public class Client2 {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        Sheet sheet = new Sheet("少利", date);
        System.out.println(sheet);
        System.out.println(sheet.getName());
        System.out.println(sheet.getBirthday());
//        Sheet clone = (Sheet) sheet.clone();
        //使用序列化反序列化实现深克隆
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(sheet);
        byte[] bytes = bos.toByteArray();
        oos.close();
        bos.close();
        ByteArrayInputStream fis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Sheet clone = (Sheet) ois.readObject();
        ois.close();
        fis.close();
        date.setTime(97987979L);
        System.out.println(sheet.getBirthday());
        System.out.println(clone);
        System.out.println(clone.getName());
        System.out.println(clone.getBirthday());
    }
}
