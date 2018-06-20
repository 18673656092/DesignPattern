package 大话设计模式.Factory.impl;

import 大话设计模式.Factory.Operation;

/**
 * Created by zhuran on 2018/6/15 0015
 */
public class MulCalculator extends Operation {
    @Override
    public double getResult() {
        return getX() * getY();
    }
}
