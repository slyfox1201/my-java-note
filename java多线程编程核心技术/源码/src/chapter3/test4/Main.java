package chapter3.test4;

/**
 * wait begin
 * java.lang.InterruptedException
 * 	at java.lang.Object.wait(Native Method)
 * 	at java.lang.Object.wait(Object.java:502)
 * 	at chapter3.test4.Service.testMethod(Service.java:8)
 * 	at chapter3.test4.ThreadA.run(ThreadA.java:13)
 *
 * Process finished with exit code 0
 */

/**
 * 当线程呈wait状态时，调用interrupt()方法会出现InterruptedException异常
 */
public class Main {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA threadA = new ThreadA(lock);
            threadA.start();
            Thread.sleep(1000);
            threadA.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
