package DecoratorDesign.CoffeeShop;

import DecoratorDesign.CoffeeShop.component.BasicCoffee;
import DecoratorDesign.CoffeeShop.component.Coffee;
import DecoratorDesign.CoffeeShop.decorator.CaramelDecorator;
import DecoratorDesign.CoffeeShop.decorator.MilkDecorator;
import DecoratorDesign.CoffeeShop.decorator.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + "-> Rs." + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + "-> Rs." + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + "-> Rs." + coffee.getCost());

        coffee =new CaramelDecorator(coffee);
        System.out.println(coffee.getDescription() + "-> Rs." + coffee.getCost());
    }
}
