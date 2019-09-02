package strategy;

import lombok.NoArgsConstructor;
import lombok.Setter;
import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

/**
 * 定义鸭子的抽象基类
 */

@Setter
@NoArgsConstructor
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
