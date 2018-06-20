package 大话设计模式.Strategy;

import 大话设计模式.Strategy.impl.ConcreteSteategyA;

/**
 * Created by zhuran on 2018/6/19 0019
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context("B");
        context.ContextInterface();
    }
}
