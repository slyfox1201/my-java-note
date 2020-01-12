package chapter1.test16;

/**
 * 是否停止1？ =true
 * 是否停止2？ =false
 * end!
 */

/**
 * Thread.interrupted()同时会清除当前线程的中断状态，因此第一次为true，而第二次为false
 */
public class Main2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？ =" + Thread.interrupted());
        System.out.println("是否停止2？ =" + Thread.interrupted());
        System.out.println("end!");
    }
}
