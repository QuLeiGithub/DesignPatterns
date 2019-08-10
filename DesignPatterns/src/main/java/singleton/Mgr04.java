package singleton;

/**
 * @Description: 静态内部类
 * * @Author:      QuLei
 * @CreateDate: 2019-08-10 23:37
 * @Version: 1.0
 */
public class Mgr04 {
    private Mgr04() {
    }

    public static Mgr04 getInstance() {
        return Mgr04Holder.INSTANCE;
    }

    private static class Mgr04Holder {
        private final static Mgr04 INSTANCE = new Mgr04();
    }
}
