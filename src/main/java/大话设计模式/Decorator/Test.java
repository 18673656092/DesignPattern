package 大话设计模式.Decorator;

import 大话设计模式.Decorator.dec.BigTrouser;
import 大话设计模式.Decorator.dec.Tshirts;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("GG");
        BigTrouser bigTrouser = new BigTrouser();
        Tshirts tshirts = new Tshirts();
        bigTrouser.Decorate(person);
        tshirts.Decorate(bigTrouser);
        tshirts.show();
    }
}
