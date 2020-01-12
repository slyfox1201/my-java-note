package chapter1.test6;

/**
 * 此处五个线程共享了同一个count变量，在MyThread类的run方法头部添加了synchronized加锁，否则会发生“非线程安全”问题
 *
 * 加锁的代码被称为“互斥区”或“临界区”
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }
}
