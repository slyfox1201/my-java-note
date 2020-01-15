package chapter2.test28;

public class RunThread implements Runnable {
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void test() {
        System.out.println("run begin");
        while (isRunning) {
//            System.out.println("h");
        }
        System.out.println("run end");
    }

    @Override
    public void run() {
        test();
    }
}
