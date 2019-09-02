package strategy;

import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

public class Main {
    public static void main(String[] args) {
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
