package chapter1.test22;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
