package 大话设计模式.Proxy.impl;

import 大话设计模式.Proxy.GiveGift;
import 大话设计模式.Proxy.SchoolGirl;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class Proxy implements GiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl){
        pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
