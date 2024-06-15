package DecoratorDesign.Starbuzz.concreteDecorator;

import DecoratorDesign.Starbuzz.component.Beverage;
import DecoratorDesign.Starbuzz.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
