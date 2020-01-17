package chapter3.test6;

/**
 * wait begin 1579174540170
 * wait begin 1579174543171
 */

/**
 * wait(long)
 * 等待一段时间后自动唤醒
 */
public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin " + System.currentTimeMillis());
                    lock.wait(3000);
                    System.out.println("wait begin " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
