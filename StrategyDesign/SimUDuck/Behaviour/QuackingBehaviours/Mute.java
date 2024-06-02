package StrategyDesign.SimUDuck.Behaviour.QuackingBehaviours;

import StrategyDesign.SimUDuck.Behaviour.QuackBehaviour;

public class Mute implements QuackBehaviour{
    
    public void quack() {
        System.out.println("Mute");
    }
}
