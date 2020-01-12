package chapter1.test20;

/**
 * end!
 * i=1
 * i=2
 * i=3
 * ...
 * i=10000
 * run begin
 * 先中断，在遇到sleep进入catch!false
 * java.lang.InterruptedException: sleep interrupted
 * 	at java.lang.Thread.sleep(Native Method)
 * 	at chapter1.test20.MyThread.run(MyThread.java:12)
 */

/**
 * 先中断线程，再进入sleep，也会陷入异常，同时进入该线程的catch语句，并清除线程的中断状态，因此显示了false
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try{
            for (int i=0; i<10000; i++){
                System.out.println("i=" + (i+1));
            }
            System.out.println("run begin");
            Thread.sleep(2000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先中断，在遇到sleep进入catch!" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
