package chapter3.test3;

public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin");
                    lock.wait();
                    System.out.println("wait end");
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
