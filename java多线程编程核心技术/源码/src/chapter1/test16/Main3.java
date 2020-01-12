package chapter1.test16;

/**
 * i=38555
 * 是否停止1？ =true
 * i=38556
 * ...
 * i=38906
 * 是否停止2？ =true
 * end!
 * i=38907
 */

/**
 * myThread.isInterrupted()方法返回调用对象的中断状态，并且不会清除中断状态，因此为两个true
 */
public class Main3 {
    public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(200);
            myThread.interrupt();
            System.out.println("是否停止1？ =" + myThread.isInterrupted());
            System.out.println("是否停止2？ =" + myThread.isInterrupted());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
