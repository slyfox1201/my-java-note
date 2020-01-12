package chapter2.test6;

/**
 * 可重入锁
 * 自己可以再次获取自己的内部锁
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
