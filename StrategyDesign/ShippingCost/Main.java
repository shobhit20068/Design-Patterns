package StrategyDesign.ShippingCost;

import StrategyDesign.ShippingCost.context.ShippingCostCalculator;
import StrategyDesign.ShippingCost.model.Order;
import StrategyDesign.ShippingCost.strategy.DistanceBasedStrategy;
import StrategyDesign.ShippingCost.strategy.FlatRate;
import StrategyDesign.ShippingCost.strategy.ShippingStrategy;
import StrategyDesign.ShippingCost.strategy.WeightBasedStrategy;

public class Main {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order(10, 100); // weight: 10kg, distance: 100km

        // Create shipping strategies
        ShippingStrategy flatRateStrategy = new FlatRate(50); // flat rate of $50
        ShippingStrategy weightBasedStrategy = new WeightBasedStrategy(5); // $5 per kg
        ShippingStrategy distanceBasedStrategy = new DistanceBasedStrategy(0.1); // $0.1 per km

        ShippingCostCalculator costCalculator = new ShippingCostCalculator(flatRateStrategy);

        // Calculate shipping costs using different strategies
        System.out.println("Flat Rate Shipping Cost: $" + costCalculator.calculate(order));

        costCalculator.setStrategy(weightBasedStrategy);
        System.out.println("Weight-Based Shipping Cost: $" + costCalculator.calculate(order));

        costCalculator.setStrategy(distanceBasedStrategy);
        System.out.println("Distance-Based Shipping Cost: $" + costCalculator.calculate(order));
    }
}
