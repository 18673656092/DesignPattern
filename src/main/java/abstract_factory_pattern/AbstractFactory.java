package abstract_factory_pattern;

import abstract_factory_pattern.Color;
import abstract_factory_pattern.Shape;

public abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}