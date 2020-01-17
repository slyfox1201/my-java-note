package chapter3.test5;

/**
 * wait begin B
 * wait begin A
 * wait begin C
 * wait end B
 *
 * Process finished with exit code -1
 */

/**
 * notify()方法只能唤醒一个线程，唤醒多个请调用notifyAll()方法,在NotifyThread修改尝试
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThread a = new MyThread(lock);
        MyThread b = new MyThread(lock);
        MyThread c = new MyThread(lock);

        a.setName("A");
        b.setName("B");
        c.setName("C");

        a.start();
        b.start();
        c.start();

        Thread.sleep(1000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }
}
