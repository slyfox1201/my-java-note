package chapter1.test16;

/**
 * i=29484
 * i=29485
 * 是否停止1？ =false
 * 是否停止2？ =false
 * end!
 * i=29486
 * i=29487
 */

/**
 * Thread.interrupted()静态方法返回当前线程是否被中断，此处为当前线程main，所以是两个false
 */

public class Main1 {
    public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(200);
            myThread.interrupt();
            System.out.println("是否停止1？ =" + Thread.interrupted());
            System.out.println("是否停止2？ =" + Thread.interrupted());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
