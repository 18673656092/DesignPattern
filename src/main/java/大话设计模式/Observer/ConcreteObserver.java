package 大话设计模式.Observer;

/**
 * Created by zhuran on 2018/6/27 0027
 */
public class ConcreteObserver extends Observer{

    private ConcreteSubject subject;
    private String name;
    private String observerState;

    public ConcreteObserver(ConcreteSubject subject,String name){
        this.name = name;
        this.subject = subject;
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println(name + " " + observerState);
    }
}
