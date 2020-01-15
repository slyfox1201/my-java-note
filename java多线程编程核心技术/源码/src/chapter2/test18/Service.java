package chapter2.test18;

public class Service {
    public void testMethod(MyObject myObject) {
        synchronized (myObject) {
            try {
                System.out.println(Thread.currentThread().getName() + " begin");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
