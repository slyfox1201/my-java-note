package chapter3.test5;

public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notify();
//            lock.notifyAll();
        }
    }
}
