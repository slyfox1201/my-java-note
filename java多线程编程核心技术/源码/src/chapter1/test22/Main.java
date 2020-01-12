package chapter1.test22;

/**
 * 注释未打开：
 * main thread begin priority=5
 * main thread end priority=5
 * MyThread1 run priority=5
 * MyThread2 run priority=5
 *
 * 打开注释：
 * main thread begin priority=5
 * main thread end priority=6
 * MyThread1 run priority=6
 * MyThread2 run priority=6
 */

/**
 * 线程的优先级具有继承性
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}
