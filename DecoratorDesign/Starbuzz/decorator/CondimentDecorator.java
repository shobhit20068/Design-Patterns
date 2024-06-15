package DecoratorDesign.Starbuzz.decorator;

import DecoratorDesign.Starbuzz.component.Beverage;

public abstract class CondimentDecorator extends Beverage{
    public Beverage beverage;
    public abstract String getDescription();
}
