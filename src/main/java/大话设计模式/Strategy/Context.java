package 大话设计模式.Strategy;

import 大话设计模式.Strategy.impl.ConcreteSteategyA;
import 大话设计模式.Strategy.impl.ConcreteSteategyB;
import 大话设计模式.Strategy.impl.ConcreteSteategyC;

/**
 * Created by zhuran on 2018/6/19 0019
 */
public class Context {

    private Steategy steategy;

    public Context(String type) {
        switch (type){
            case "A":steategy = new ConcreteSteategyA();break;
            case "B":steategy = new ConcreteSteategyB();break;
            case "C":steategy = new ConcreteSteategyC();break;
        }
    }

    public void ContextInterface() {
        steategy.AlgorithmInterface();
    }
}
