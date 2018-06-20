package abstract_factory_pattern;

import abstract_factory_pattern.Color;

public class Red implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}