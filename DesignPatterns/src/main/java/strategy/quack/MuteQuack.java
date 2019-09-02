package strategy.quack;

/**
 * @Description: 绿头鸭叫的方式
 * @Author: QuLei
 * @CreateDate: 2019/8/13 20:36
 * @Version: 1.0
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("gua gua gua ");
    }
}
