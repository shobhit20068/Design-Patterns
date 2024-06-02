package StrategyDesign.SimUDuck.Behaviour.FlyingBehaviours;

import StrategyDesign.SimUDuck.Behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour{
    
    public void fly() {
        System.out.println("Can't fly");
    }
    
}
