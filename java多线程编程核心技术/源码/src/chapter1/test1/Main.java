package chapter1.test1;

/**
 * 通过继承Thread来实现线程
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束");
    }
}
