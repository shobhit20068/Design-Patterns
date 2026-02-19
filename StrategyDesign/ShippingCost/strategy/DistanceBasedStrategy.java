package StrategyDesign.ShippingCost.strategy;

import StrategyDesign.ShippingCost.model.Order;

public class DistanceBasedStrategy implements ShippingStrategy {
    private double costPerKm;

    public DistanceBasedStrategy(double costPerKm) {
        this.costPerKm = costPerKm;
    }

    @Override
    public double calculateShippingCost(Order order) {
        return order.getDistance() * costPerKm;
    }
}
