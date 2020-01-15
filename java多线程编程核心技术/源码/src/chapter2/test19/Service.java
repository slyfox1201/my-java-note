package chapter2.test19;

public class Service {
    synchronized public static void printA() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println(Thread.currentThread().getName() + " begin");
        System.out.println(Thread.currentThread().getName() + " end");
    }

    synchronized public void printC() {
        System.out.println(Thread.currentThread().getName() + " begin");
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
