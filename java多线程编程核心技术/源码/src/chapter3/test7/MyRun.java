package chapter3.test7;

/**
 * notify begin
 * notify end
 */

/**
 * 为了防止notify过早，设置了isFirstRunB变量来控制
 */
public class MyRun {
    private final String lock = new String("");
    private boolean isFirstRunB = false;
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    while (!isFirstRunB) {
                        System.out.println("wait begin");
                        lock.wait();
                        System.out.println("wait end");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin");
                lock.notify();
                System.out.println("notify end");
                isFirstRunB = true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRun run = new MyRun();
        Thread b = new Thread(run.runnableB);
        b.start();
        Thread.sleep(500);
        Thread a = new Thread(run.runnableA);
        a.start();
    }

    /**
     * wait begin
     * notify begin
     * notify end
     * wait end
     */
//    public static void main(String[] args) throws InterruptedException {
//        MyRun run = new MyRun();
//        Thread a = new Thread(run.runnableA);
//        a.start();
//        Thread.sleep(500);
//        Thread b = new Thread(run.runnableB);
//        b.start();
//    }
}
