package DecoratorDesign.Starbuzz.concreteComponent;

import DecoratorDesign.Starbuzz.component.Beverage;

public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
    
}