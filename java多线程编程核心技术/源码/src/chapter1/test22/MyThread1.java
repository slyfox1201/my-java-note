package chapter1.test22;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
