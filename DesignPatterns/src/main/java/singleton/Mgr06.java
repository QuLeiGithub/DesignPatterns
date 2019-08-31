package singleton;

/**
 * @author QuLei
 */
public class Mgr06 {
    /**
     * 不加volatile会发生指令重排序
     */

    private static volatile Mgr06 INSTANCE;

    private Mgr06() {
    }

    public static Mgr06 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mgr06.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        return INSTANCE;
    }
}
