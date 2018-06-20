package strategy_pattern;

/**
 * Created by zhuran on 2018/6/15 0015
 */
public class DisplayA implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("WAHAH");
    }
}
