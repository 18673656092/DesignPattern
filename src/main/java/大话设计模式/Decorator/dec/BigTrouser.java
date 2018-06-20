package 大话设计模式.Decorator.dec;

import 大话设计模式.Decorator.Finery;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.println("BigTrouser");
        super.show();
    }
}
