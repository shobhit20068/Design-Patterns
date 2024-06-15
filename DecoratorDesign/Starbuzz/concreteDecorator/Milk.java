package DecoratorDesign.Starbuzz.concreteDecorator;

import DecoratorDesign.Starbuzz.component.Beverage;
import DecoratorDesign.Starbuzz.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
