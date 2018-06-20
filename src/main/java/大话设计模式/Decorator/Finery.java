package 大话设计模式.Decorator;

/**
 * Created by zhuran on 2018/6/20 0020
 */
public class Finery extends Person {
    private Person person;
    public void Decorate(Person person){
        this.person = person;
    }
    public void show(){
        if(person != null){
            person.show();
        }
    }
}
