package cn.test.sync;

/**
 * 和T等价  静态的只能锁方法
 *
 * @author QuLei
 */
public class T1 {
    private int count = 10;

    public void m() {
        synchronized (this) {
            count--;
            System.out.println(Thread.currentThread().getName() + "count = " + count);
        }
    }
}
