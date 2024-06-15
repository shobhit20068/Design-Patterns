package DecoratorDesign.Starbuzz.concreteComponent;

import DecoratorDesign.Starbuzz.component.Beverage;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
    
}

