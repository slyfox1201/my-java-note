package chapter2.test14;

public class ObjectService {
    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("A begin");
                Thread.sleep(2000);
                System.out.println("A end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void serviceMethodB() {
        System.out.println("B begin");
        System.out.println("B end");
    }
}
