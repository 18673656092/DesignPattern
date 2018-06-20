package 大话设计模式.Proxy.impl;

import 大话设计模式.Proxy.GiveGift;
import 大话设计模式.Proxy.SchoolGirl;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class Pursuit implements GiveGift {

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl){
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(schoolGirl.getName() + " Dolls");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schoolGirl.getName() + " Flowers");
    }

    @Override
    public void giveChocolate() {
        System.out.println(schoolGirl.getName() + " Chocolate");
    }
}
