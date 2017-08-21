package com.wxc.adaptorMode;

/**
 * Created by wangxc on 2017/8/21/021 18:48.
 * 客户端类，相当于只有usb接口的笔记本
 */
public class Client {
    public void test1(Target t) {
        t.handle();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adaptor adaptor = new Adaptor();
        client.test1(adaptor);
        Adaptor2 adaptor2 = new Adaptor2(new Adaptee());
        client.test1(adaptor2);
    }
}
