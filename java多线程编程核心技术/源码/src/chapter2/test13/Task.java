package chapter2.test13;

public class Task {
    public void doLongTimeTask() {
        for (int i = 0; i < 5; i++) {
            System.out.println("no synchronized thread name = " + Thread.currentThread().getName() + " i = " + i);
        }
        System.out.println();
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println("synchronized thread name = " + Thread.currentThread().getName() + " i = " + i);
            }
        }
    }
}
