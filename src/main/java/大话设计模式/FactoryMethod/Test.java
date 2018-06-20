package 大话设计模式.FactoryMethod;

import 大话设计模式.FactoryMethod.impl.DivCalculatorFactory;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class Test {
    public static void main(String[] args) {
        DivCalculatorFactory divCalculatorFactory = new DivCalculatorFactory();
        Operation operation1 = divCalculatorFactory.createOperation();
        operation1.setX(1.0);
        operation1.setY(2.0);
        System.out.println(operation1.getResult());
    }
}
