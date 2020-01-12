package chapter2.test8;

public class Service {
    synchronized public void testMethod() {
        System.out.println("begin ThreadName= " + Thread.currentThread().getName());
        try {
            if (Thread.currentThread().getName().equals("A")) {
                Thread.sleep(2000);
                Integer.parseInt("a");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end ThreadName= " + Thread.currentThread().getName());
    }
}
