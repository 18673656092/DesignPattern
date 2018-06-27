package 大话设计模式.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuran on 2018/6/27 0027
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
