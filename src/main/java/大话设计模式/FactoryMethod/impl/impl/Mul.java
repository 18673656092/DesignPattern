package 大话设计模式.FactoryMethod.impl.impl;

import 大话设计模式.FactoryMethod.Operation;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class Mul extends Operation {
    @Override
    public double getResult() {
        if(getY()!=0)
            return getX() / getY();
        else
            return 0.0;
    }
}
