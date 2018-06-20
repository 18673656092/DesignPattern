package 大话设计模式.Factory;

import com.sun.org.apache.xpath.internal.operations.Div;
import 大话设计模式.Factory.impl.DivCalculator;
import 大话设计模式.Factory.impl.MulCalculator;
import 大话设计模式.Factory.impl.SubCalculator;
import 大话设计模式.Factory.impl.SumCalculator;

/**
 * Created by zhuran on 2018/6/15 0015
 */
public class OptionCalculatorFactory {
    private static Operation operation;
    public static Operation calculator(String operate){
        switch (operate){
            case "+":operation = new SumCalculator();break;
            case "-":operation = new SubCalculator();break;
            case "*":operation = new MulCalculator();break;
            case "/":operation = new DivCalculator();break;
        }
        return operation;
    }
}
