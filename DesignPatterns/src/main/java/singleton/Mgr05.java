package singleton;

/**
 * @Description: 枚举的写法
 * * @Author:      QuLei
 * @CreateDate: 2019-08-10 23:46
 * @Version: 1.0
 */
public enum Mgr05 {
    INSTANCE;

    public void m() {
        System.out.println("枚举的方式实现单例！！！");
    }
}
