package chapter2.test18;

public class MyObject {
    synchronized public void speedPrintService(){
        System.out.println(Thread.currentThread().getName() + " begin");
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
