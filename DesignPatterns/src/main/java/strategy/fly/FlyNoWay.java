package strategy.fly;

/**
 * @Description: 不会飞
 * @Author: QuLei
 * @CreateDate: 2019/8/13 20:33
 * @Version: 1.0
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cant't fly");
    }
}
