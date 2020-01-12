package chapter1.test18;

/**
 * i=32273
 * 已经是停止状态了，我要退出了
 * 进入MyThread.java类的run方法中的catch了
 * end!
 * java.lang.InterruptedException
 * 	at chapter1.test18.MyThread.run(MyThread.java:11)
 */

/**
 * 通过异常来停止线程
 */
public class Main {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(200);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
