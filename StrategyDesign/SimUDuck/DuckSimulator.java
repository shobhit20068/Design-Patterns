package StrategyDesign.SimUDuck;

import StrategyDesign.SimUDuck.Behaviour.FlyBehaviour;
import StrategyDesign.SimUDuck.Behaviour.QuackBehaviour;
import StrategyDesign.SimUDuck.Behaviour.FlyingBehaviours.FlyNoWay;
import StrategyDesign.SimUDuck.Behaviour.FlyingBehaviours.FlyWithWings;
import StrategyDesign.SimUDuck.Behaviour.QuackingBehaviours.Mute;
import StrategyDesign.SimUDuck.Behaviour.QuackingBehaviours.Quack;
import StrategyDesign.SimUDuck.Behaviour.QuackingBehaviours.Squeak;
import StrategyDesign.SimUDuck.Client.Duck;
import StrategyDesign.SimUDuck.Client.DuckSubclasses.DecoyDuck;
import StrategyDesign.SimUDuck.Client.DuckSubclasses.MallardDuck;
import StrategyDesign.SimUDuck.Client.DuckSubclasses.RubberDuck;

public class DuckSimulator {

    public static void simulate(Duck duck, FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        duck.setFlyBehaviour(flyBehaviour);
        duck.setQuackBehaviour(quackBehaviour);
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
    
    public static void main(String args[]) {

        simulate(new MallardDuck(), new FlyWithWings(), new Quack());

        simulate(new RubberDuck(), new FlyNoWay(), new Squeak());

        simulate(new DecoyDuck(), new FlyNoWay(), new Mute());
    }
}
