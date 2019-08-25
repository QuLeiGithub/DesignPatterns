package cn.test;

import org.junit.Test;

public class DemoTest {
    @Test
    public void testField(){
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
    }
}
