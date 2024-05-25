package StrategyDesign.Behaviour.FlyingBehaviours;

import StrategyDesign.Behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour{
    
    public void fly() {
        System.out.println("Can't fly");
    }
    
}
