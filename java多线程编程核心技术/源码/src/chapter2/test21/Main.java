package chapter2.test21;

/**
 * username = a
 * username = b
 */

/**
 * 死锁，A，B互相请求对方已经持有的锁，导致死锁
 */
public class Main {
    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
