package build_patten;

/*
   构建器（Builder）模式使用简单对象并使用逐步方法构建复杂对象。 这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
   构建器（Builder）模式构建器逐步构建最终对象，此构建器独立于其他对象。
*/
public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}