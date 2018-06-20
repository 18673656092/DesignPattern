package 大话设计模式.Proxy;

import 大话设计模式.Proxy.impl.Proxy;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class Test {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("jiaojiao");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
