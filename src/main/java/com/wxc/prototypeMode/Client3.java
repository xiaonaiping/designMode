package com.wxc.prototypeMode;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangxc on 2017/8/20/020 21:55.
 * 测试新建对象与克隆模式的效率差异
 * 克隆模式适合短时间创建大量对象，并且new的时间比较耗时，可以考虑使用原型模式
 */
public class Client3 {
    public static void testNew(int size){
        Stopwatch stopwatch = Stopwatch.createStarted();
        for(int i=0;i<size;i++){
            Laptop laptop = new Laptop();
        }
        stopwatch.stop();
        System.out.println("新建对象一共耗时"+stopwatch.elapsed(TimeUnit.MILLISECONDS)+"毫秒");
    }

    public static void testClone(int size) throws CloneNotSupportedException {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Laptop laptop = new Laptop();
        for(int i=0;i<size;i++){
            laptop.clone();
        }
        stopwatch.stop();
        System.out.println("克隆对象一共耗时"+stopwatch.elapsed(TimeUnit.MILLISECONDS)+"毫秒");
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        testNew(1000);
        testClone(1000);
    }
}

class Laptop implements Cloneable {//笔记本
    public Laptop(){//创建对象好耗时较长
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}