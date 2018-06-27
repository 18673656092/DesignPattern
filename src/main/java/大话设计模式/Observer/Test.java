package 大话设计模式.Observer;

/**
 * Created by zhuran on 2018/6/27 0027
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"X"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"Y"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"Z"));
        concreteSubject.setSubjectState("ABC");
        concreteSubject.notifyObserver();
        concreteSubject.setSubjectState("DEF");
        concreteSubject.notifyObserver();
    }
}
