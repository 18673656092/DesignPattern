package abstract_factory_pattern;

import abstract_factory_pattern.Shape;

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}