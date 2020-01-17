package chapter3.test2;

public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("wait begin");
                lock.wait();
                System.out.println("wait end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
