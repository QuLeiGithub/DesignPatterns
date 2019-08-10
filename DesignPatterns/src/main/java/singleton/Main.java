package singleton;

/**
 * @Description: 测试单例模式
 * * @Author:      QuLei
 * @CreateDate: 2019-08-10 23:43
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Mgr05 mgr05 = Mgr05.INSTANCE;
        mgr05.m();
    }
}
