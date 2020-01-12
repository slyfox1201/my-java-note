package chapter1.test11;

/**
 * isAlive()方法
 * 判断线程是否存活
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin ==" + myThread.isAlive());
        myThread.start();
//        Thread.sleep(1000);
        System.out.println("end ==" + myThread.isAlive());
    }
}
