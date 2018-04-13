package com.wxc.prototypeMode;

import java.util.Date;

/**
 * Created by wangxc on 2017/8/20 19:48.
 * 深浅复制模式（更改sheet类注释代码即可查看区别）
 */
public class Client1 {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        Sheet sheet = new Sheet("少利", date);
        System.out.println(sheet);
        System.out.println(sheet.getName());
        System.out.println(sheet.getBirthday());
        Sheet clone = (Sheet) sheet.clone();
        date.setTime(97987979L);
        System.out.println(sheet.getBirthday());
        System.out.println(clone);
        System.out.println(clone.getName());
        System.out.println(clone.getBirthday());
    }
}
