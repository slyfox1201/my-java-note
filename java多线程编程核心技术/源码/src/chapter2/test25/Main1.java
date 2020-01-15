package chapter2.test25;

/**
 * A begin
 * B begin
 * A end
 * B end
 */

/**
 * 锁对象改变，导致A、B不同步
 */
public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThread myThreadA = new MyThread(myService);
        MyThread myThreadB = new MyThread(myService);
        myThreadA.setName("A");
        myThreadB.setName("B");
        myThreadA.start();
        Thread.sleep(50);
        myThreadB.start();
    }
}
