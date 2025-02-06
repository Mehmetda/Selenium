package TESTNG;

import org.testng.annotations.Test;

public class C01_TESTNG {
    @Test(priority = 5)
    public void test01() {
        System.out.println("test01 çalıştı");
    }
    @Test(priority = 4)
    public void test02() {
        System.out.println("test02 çalıştı");
    }
    @Test(priority = 3)
    public void test03() {
        System.out.println("test03 çalıştı");
    }
    @Test(priority = 2)
    public void test04() {
        System.out.println("test04 çalıştı");
    }
    @Test (priority = 1)
    public void test05() {
        System.out.println("test05 çalıştı");
    }
}
