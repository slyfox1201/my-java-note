package chapter1.test13;

/**
 * sleep()方法
 * myThread1调用了run
 */
public class Main1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin=" + System.currentTimeMillis());
        myThread1.run();
        System.out.println("end=" + System.currentTimeMillis());
    }
}
