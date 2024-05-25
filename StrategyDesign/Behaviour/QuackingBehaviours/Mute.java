package StrategyDesign.Behaviour.QuackingBehaviours;

import StrategyDesign.Behaviour.QuackBehaviour;

public class Mute implements QuackBehaviour{
    
    public void quack() {
        System.out.println("Mute");
    }
}
