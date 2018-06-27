package 大话设计模式.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuran on 2018/6/27 0027
 */
public class Product {

    private List<String> parts = new ArrayList<>();
    public void add(String part){
        parts.add(part);
    }
    public void show(){
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
