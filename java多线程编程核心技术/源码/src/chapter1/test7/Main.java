package chapter1.test7;

/**
 * 测试synchronized关键字对同步的影响
 */
public class Main {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
