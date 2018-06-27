package 大话设计模式.Prototypel;

import 大话设计模式.Prototypel.impl.Resume;

/**
 * Created by zhuran on 2018/6/26 0026
 */
public class Test {
    public static void main(String[] args) {
        Resume a = new Resume("大哥");
        a.setPersonalInfo("男","19");
        a.setWordExperience("1990-1998","vip");
        a.display();
        Resume b = (Resume) a.clone();
        b.setPersonalInfo("女","17");
        b.setWordExperience("1991-1999","vip");
        b.display();
        Resume c = (Resume) a.clone();
        c.setPersonalInfo("人妖","16");
        c.setWordExperience("1992-2000","vip");
        c.display();
    }
}
