package chapter2.test20;

public class Service {
    public static void print(String stringParam) {
        try {
            synchronized (stringParam) {
                System.out.println(Thread.currentThread().getName() + " begin");
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
