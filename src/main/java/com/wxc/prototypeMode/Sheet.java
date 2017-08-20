package com.wxc.prototypeMode;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wangxc on 2017/8/20 19:43.
 */
public class Sheet implements Cloneable, Serializable {//纪念多利，克隆羊(*╹▽╹*)
    private String name;
    private Date birthday;

    public Sheet(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Sheet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 克隆方法，重写object的clone方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        //添加下面代码实现深复制---start
       /* Sheet s= (Sheet) obj;
        s.birthday= (Date) this.birthday.clone();*/
        //代码实现深复制---end
        return obj;
    }
}
