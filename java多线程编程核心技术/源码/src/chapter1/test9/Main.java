package chapter1.test9;

/**
 * currentThread()方法
 * MyThread构造方法被main线程调用，
 * MyThread的run方法被Thread-0线程调用
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.run();
    }
}
