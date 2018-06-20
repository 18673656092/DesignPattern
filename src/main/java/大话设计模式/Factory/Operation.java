package 大话设计模式.Factory;

/**
 * Created by zhuran on 2018/6/15 0015
 */
public class Operation implements ICalculator {

    private int x;

    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double getResult() {
        return 0;
    }
}
