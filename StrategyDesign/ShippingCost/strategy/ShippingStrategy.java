package StrategyDesign.ShippingCost.strategy;

import StrategyDesign.ShippingCost.model.Order;

public interface ShippingStrategy {
    double calculateShippingCost(Order order);
}
