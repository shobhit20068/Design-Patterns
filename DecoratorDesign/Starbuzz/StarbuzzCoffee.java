package DecoratorDesign.Starbuzz;

import DecoratorDesign.Starbuzz.component.Beverage;
import DecoratorDesign.Starbuzz.concreteComponent.Espresso;
import DecoratorDesign.Starbuzz.concreteComponent.HouseBlend;
import DecoratorDesign.Starbuzz.concreteDecorator.Mocha;

public class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $"+beverage2.cost());
    }
}
