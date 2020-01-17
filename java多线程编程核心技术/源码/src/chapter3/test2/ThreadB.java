package chapter3.test2;

public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("notify begin");
            lock.notify();
            System.out.println("notify end");
        }
    }
}
