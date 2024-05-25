package StrategyDesign.Behaviour.QuackingBehaviours;

import StrategyDesign.Behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour{
    
    public void quack() {
        System.out.println("Squeak Squeak");
    }
    
}
