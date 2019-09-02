package strategy.quack;

/**
 * @Description: 叫的一种方式
 * @Author: QuLei
 * @CreateDate: 2019/8/13 20:35
 * @Version: 1.0
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
