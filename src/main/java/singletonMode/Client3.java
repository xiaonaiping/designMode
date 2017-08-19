package singletonMode;


import com.google.common.base.Stopwatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangxc on 2017/8/19 11:59.
 * 测试五种单例模式的效率
 */
public class Client3 {
    public static void main(String[] args) throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();
        CountDownLatch countDownLatch = new CountDownLatch(10);
        int i=0;
        do{
            new Thread(()->{
                for(int j=0;j<100000;j++){
                    Object o=Singleton2.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }while(++i<10);
        countDownLatch.await();
        stopwatch.stop();
        System.out.println("一共消耗了:"+stopwatch.elapsed(TimeUnit.MILLISECONDS)+"毫秒");
    }
}
