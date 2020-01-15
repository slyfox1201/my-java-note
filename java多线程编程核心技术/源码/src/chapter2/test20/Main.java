package chapter2.test20;

/**
 * A begin
 * A end
 * B begin
 * B end
 */

/**
 * A,B 线程使用了同一个字符串常量作为对象锁，因此两个线程是同步的
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThreadA = new MyThread();
        MyThread myThreadB = new MyThread();
        myThreadA.setName("A");
        myThreadB.setName("B");
        myThreadA.start();
        myThreadB.start();
    }
}
