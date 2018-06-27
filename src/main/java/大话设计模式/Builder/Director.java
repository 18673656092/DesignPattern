package 大话设计模式.Builder;

/**
 * Created by zhuran on 2018/6/27 0027
 */
public class Director {
    public void Construct(Builder builder){
        builder.builderA();
        builder.builderB();
    }
}
