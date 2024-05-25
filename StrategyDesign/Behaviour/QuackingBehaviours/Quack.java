package StrategyDesign.Behaviour.QuackingBehaviours;

import StrategyDesign.Behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour{
    
    public void quack() {
        System.out.println("Quack Quack");
    }
}
