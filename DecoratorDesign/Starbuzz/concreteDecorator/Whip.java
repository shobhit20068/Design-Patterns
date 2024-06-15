package DecoratorDesign.Starbuzz.concreteDecorator;

import DecoratorDesign.Starbuzz.component.Beverage;
import DecoratorDesign.Starbuzz.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
