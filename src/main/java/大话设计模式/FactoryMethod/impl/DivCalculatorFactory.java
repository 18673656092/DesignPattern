package 大话设计模式.FactoryMethod.impl;

import 大话设计模式.FactoryMethod.ICalculatorFactory;
import 大话设计模式.FactoryMethod.Operation;
import 大话设计模式.FactoryMethod.impl.impl.Div;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class DivCalculatorFactory implements ICalculatorFactory {

    @Override
    public Operation createOperation() {
        return new Div();
    }
}
