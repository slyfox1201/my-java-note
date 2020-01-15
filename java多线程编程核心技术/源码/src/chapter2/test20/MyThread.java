package chapter2.test20;

public class MyThread extends Thread{

    @Override
    public void run() {
        Service.print("AA");
    }
}
