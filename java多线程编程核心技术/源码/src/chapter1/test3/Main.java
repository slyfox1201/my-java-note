package chapter1.test3;

/**
 * 证明start方法的顺序不代表线程的启动顺序
 */
public class Main {
    public static void main(String[] args) {
        MyThread tl1 = new MyThread(1);
        MyThread tl2 = new MyThread(2);
        MyThread tl3 = new MyThread(3);
        MyThread tl4 = new MyThread(4);
        MyThread tl5 = new MyThread(5);

        tl1.start();
        tl2.start();
        tl3.start();
        tl4.start();
        tl5.start();
    }
}
