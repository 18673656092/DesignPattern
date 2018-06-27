package 大话设计模式.Looker;

/**
 * Created by zhuran on 2018/6/27 0027
 */
public class Facade {

    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void M1(){
        subSystemOne.MethodOne();
        subSystemTwo.MethodTwo();
    }

    public void M2(){
        subSystemTwo.MethodTwo();
        subSystemThree.MethodThree();
    }

}