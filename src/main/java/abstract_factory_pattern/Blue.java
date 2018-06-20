package abstract_factory_pattern;

import abstract_factory_pattern.Color;

public class Blue implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}