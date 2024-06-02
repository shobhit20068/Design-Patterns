package StrategyDesign.SimUDuck.Behaviour.QuackingBehaviours;

import StrategyDesign.SimUDuck.Behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour{
    
    public void quack() {
        System.out.println("Squeak Squeak");
    }
    
}
