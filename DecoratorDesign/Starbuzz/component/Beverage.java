package DecoratorDesign.Starbuzz.component;

public abstract class Beverage {
    public String description = "Unknown";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
