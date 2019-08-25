package cn.test.juc;

/**
 * @author QuLei
 */
public class T04_ThreadState {
    public static void main(String[] args) {
        Thread.State state = new Thread().getState();

    }
}
