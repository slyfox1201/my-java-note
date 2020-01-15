package chapter2.test25;

public class MyService {
    private String lock = "123";

    public void testMethod() {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " begin");
                lock = "456";
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
