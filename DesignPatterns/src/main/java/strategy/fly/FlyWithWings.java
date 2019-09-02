package strategy.fly;

/**
 * @Description: 用翅膀飞，飞的一种方式
 * @Author: QuLei
 * @CreateDate: 2019/8/13 20:31
 * @Version: 1.0
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm fly with wing");
    }
}
