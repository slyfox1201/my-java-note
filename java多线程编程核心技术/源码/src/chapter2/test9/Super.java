package chapter2.test9;

public class Super {
    synchronized public void serviceMethod() {
        try {
            System.out.println("begin super method= " + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("end super method= " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
