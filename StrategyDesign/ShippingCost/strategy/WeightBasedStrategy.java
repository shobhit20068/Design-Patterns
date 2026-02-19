package StrategyDesign.ShippingCost.strategy;

import StrategyDesign.ShippingCost.model.Order;

public class WeightBasedStrategy implements ShippingStrategy {
    private double costPerKg;

    public WeightBasedStrategy(double costPerKg) {
        this.costPerKg = costPerKg;
    }

    @Override
    public double calculateShippingCost(Order order) {
        return order.getWeight() * costPerKg;
    }
}
