package chapter1.test5;

/**
 * 共创建了三个线程，他们不共享count变量
 */
public class Main {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");

        a.start();
        b.start();
        c.start();
    }
}
