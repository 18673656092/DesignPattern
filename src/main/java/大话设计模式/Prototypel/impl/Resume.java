package 大话设计模式.Prototypel.impl;

import 大话设计模式.Prototypel.ICloneble;
import 大话设计模式.Prototypel.WorkExperience;

/**
 * Created by zhuran on 2018/6/26 0026
 */
public class Resume implements ICloneble,Cloneable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public Resume(String name){
        this.name = name;
        workExperience = new WorkExperience();
    }

    @Override
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    @Override
    public void setWordExperience(String timeArea, String company) {
        this.workExperience.setWorkDate(timeArea);
        this.workExperience.setCompany(company);
    }

    @Override
    public void display() {
        System.out.println(name + " " + age + " " + sex);
        System.out.println(workExperience.getWorkDate() + " " + workExperience.getCompany());
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
