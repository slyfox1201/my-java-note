package chapter3.test3;

/**
 * wait begin
 * 添加了 1个元素
 * 添加了 2个元素
 * 添加了 3个元素
 * 添加了 4个元素
 * 已经发出了通知
 * 添加了 5个元素
 * 添加了 6个元素
 * 添加了 7个元素
 * 添加了 8个元素
 * 添加了 9个元素
 * 添加了 10个元素
 * wait end
 */

/**
 * 用wait notify来实现test1的实例
 *
 * 同时说明了 notify()方法执行后并不立即释放锁
 */

/**
 * 线程进入Runnable的情况：
 * 1.调用sleep()方法后经过的时间超过了指定的休眠时间
 * 2.线程调用的阻塞IO已经返回，阻塞方法执行完毕
 * 3.线程成功地获得了试图同步的监视器
 * 4.线程正在等待某个通知，其他线程发出了通知
 * 5.处于挂起状态的线程调用了resume恢复方法
 *
 * 线程进入Block的情况：
 * 1.线程调用sleep()方法，主动放弃占用的处理器资源
 * 2.线程调用了阻塞式IO方法，在该方法返回前，该线程被阻塞
 * 3.线程试图获得一个同步监视器，但该同步监视器正被其他线程所持有
 * 4.线程等待某个通知
 * 5.程序调用了suspend方法将该线程挂起。此方法容易导致死锁，尽量避免使用该方法
 */
public class Main {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA threadA = new ThreadA(lock);
            threadA.start();
            Thread.sleep(50);
            ThreadB threadB = new ThreadB(lock);
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
