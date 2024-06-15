package DecoratorDesign.Starbuzz.concreteDecorator;

import DecoratorDesign.Starbuzz.component.Beverage;
import DecoratorDesign.Starbuzz.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
