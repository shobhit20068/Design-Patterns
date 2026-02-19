package StrategyDesign.ShippingCost.strategy;

import StrategyDesign.ShippingCost.model.Order;

public class FlatRate implements ShippingStrategy {
    private double flatRate;

    public FlatRate(double flatRate) {
        this.flatRate = flatRate;
    }

    @Override
    public double calculateShippingCost(Order order) {
        return flatRate;
    }
}
