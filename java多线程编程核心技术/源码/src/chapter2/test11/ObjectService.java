package chapter2.test11;

public class ObjectService {
    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time = " + System.currentTimeMillis() + "----" + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("end time = " + System.currentTimeMillis() + "----" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
