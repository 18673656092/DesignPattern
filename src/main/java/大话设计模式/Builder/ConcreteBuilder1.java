package 大话设计模式.Builder;

/**
 * Created by zhuran on 2018/6/27 0027
 */
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void builderA() {
        product.add("A");
    }

    @Override
    public void builderB() {
        product.add("B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
