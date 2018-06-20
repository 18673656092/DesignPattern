package 大话设计模式.Factory;

/**
 * Created by zhuran on 2018/6/15 0015
 */
public class Test {
    public static void main(String[] args) {
        Operation operation = OptionCalculatorFactory.calculator("+");
        operation.setX(4);
        operation.setY(7);
        System.out.println(operation.getResult());
    }
}
