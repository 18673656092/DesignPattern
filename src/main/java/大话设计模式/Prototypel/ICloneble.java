package 大话设计模式.Prototypel;

/**
 * Created by zhuran on 2018/6/26 0026
 */
public interface ICloneble {
    void setPersonalInfo(String sex,String age);
    void setWordExperience(String timeArea,String company);
    void display();
    Object clone();
}
