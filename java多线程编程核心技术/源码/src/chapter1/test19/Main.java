package chapter1.test19;

/**
 * run begin
 * 在沉睡中被停止，进入catch！false
 * end!
 * java.lang.InterruptedException: sleep interrupted
 * 	at java.lang.Thread.sleep(Native Method)
 * 	at chapter1.test19.MyThread.run(MyThread.java:9)
 */

/**
 * 在sleep状态下停止进程，会产生异常，进入该线程的catch语句，并清除线程的中断状态，因此显示了false
 */
public class Main {
    public static void main(String[] args) {
        try{
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
