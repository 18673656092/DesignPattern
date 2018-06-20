package 大话设计模式.Decorator;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class Person {

    public Person(){

    }

    private String name;

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(name);
    }
}
