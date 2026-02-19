package StrategyDesign.ShippingCost.model;

public class Order {
    private double weight;
    private double distance;

    public Order(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }
}
