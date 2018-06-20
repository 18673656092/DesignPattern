package 大话设计模式.FactoryMethod.impl.impl;

import 大话设计模式.FactoryMethod.Operation;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class Sum extends Operation {
    @Override
    public double getResult() {
        return getX() + getY();
    }
}
