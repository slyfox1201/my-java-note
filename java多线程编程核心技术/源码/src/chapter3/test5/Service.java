package chapter3.test5;

public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("wait begin " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("wait end " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
