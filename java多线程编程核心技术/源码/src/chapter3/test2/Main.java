package chapter3.test2;

/**
 * wait begin
 * notify begin
 * notify end
 * wait end
 */

/**
 * wait() notify()方法实例
 * 两者都是Object类的方法，只能在synchronized方法或代码块中调用，且在调用前必须获取对象锁，否则抛出IllegalMonitorStateException
 * 执行wait()后，当前线程释放锁，线程加入阻塞队列；
 * 执行notify()后，从阻塞队列中随机挑选出一个线程，对其发出通知，使它等待获取对象锁
 * 执行notify()后，要等到其所在线程执行完，才会释放对象锁，然后wait()线程再能获取对象锁
 *
 * wait()释放锁
 * notify(),sleep()不释放锁
 */
public class Main {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA threadA = new ThreadA(lock);
            ThreadB threadB = new ThreadB(lock);
            threadA.start();
            Thread.sleep(1000);
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
