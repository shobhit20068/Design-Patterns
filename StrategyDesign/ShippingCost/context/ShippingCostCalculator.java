package StrategyDesign.ShippingCost.context;

import StrategyDesign.ShippingCost.model.Order;
import StrategyDesign.ShippingCost.strategy.ShippingStrategy;

public class ShippingCostCalculator {
        private ShippingStrategy strategy;

        public ShippingCostCalculator(ShippingStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(ShippingStrategy strategy) {
            this.strategy = strategy;
        }

        public double calculate(Order order) {
            return strategy.calculateShippingCost(order);
        }
}
