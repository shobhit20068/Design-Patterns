package StrategyDesign.SimUDuck.Client;

import StrategyDesign.SimUDuck.Behaviour.FlyBehaviour;
import StrategyDesign.SimUDuck.Behaviour.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
        
    }

    public abstract void display(); 

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour fB) {
        flyBehaviour = fB;
    }

    public void setQuackBehaviour(QuackBehaviour qB) {
        quackBehaviour = qB;
    }
}