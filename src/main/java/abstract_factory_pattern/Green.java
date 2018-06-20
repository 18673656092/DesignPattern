package abstract_factory_pattern;

import abstract_factory_pattern.Color;

public class Green implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}