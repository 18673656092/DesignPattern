package 大话设计模式.Builder;

/**
 * Created by zhuran on 2018/6/27 0027
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();
        director.Construct(b1);
        director.Construct(b2);
        Product product1 = b1.getResult();
        Product product2 = b2.getResult();
        product1.show();
        product2.show();
    }
}
