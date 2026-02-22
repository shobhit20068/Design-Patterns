package DecoratorDesign.CoffeeShop.decorator;

import DecoratorDesign.CoffeeShop.component.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }


    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription(){
        return coffee.getDescription();
    }

}
