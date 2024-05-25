package StrategyDesign;

import StrategyDesign.Behaviour.FlyBehaviour;
import StrategyDesign.Behaviour.QuackBehaviour;
import StrategyDesign.Behaviour.FlyingBehaviours.FlyNoWay;
import StrategyDesign.Behaviour.FlyingBehaviours.FlyWithWings;
import StrategyDesign.Behaviour.QuackingBehaviours.Mute;
import StrategyDesign.Behaviour.QuackingBehaviours.Quack;
import StrategyDesign.Behaviour.QuackingBehaviours.Squeak;
import StrategyDesign.Client.Duck;
import StrategyDesign.Client.DuckSubclasses.DecoyDuck;
import StrategyDesign.Client.DuckSubclasses.MallardDuck;
import StrategyDesign.Client.DuckSubclasses.RubberDuck;

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
