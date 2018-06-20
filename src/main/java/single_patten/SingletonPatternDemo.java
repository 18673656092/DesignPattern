package single_patten;

/*
    单例（Singleton）模式是Java中最简单的设计模式之一。这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
    这种模式涉及一个类，它负责创建一个对象，同时确保只创建一个对象。这个类提供了一种方法来访问它的唯一对象，可以直接访问，而不需要实例化类的对象。
*/
public class SingletonPatternDemo {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      SingleObject object = SingleObject.getInstance();

      //show the message
      object.showMessage();

      System.out.println(object.toString());
      SingleObject object1 = SingleObject.getInstance();
      System.out.println(object1.toString());
   }
}