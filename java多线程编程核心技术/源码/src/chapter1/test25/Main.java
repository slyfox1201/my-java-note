package chapter1.test25;

/**
 * i=1
 * i=2
 * i=3
 * 我（main）结束后，myThread对象也不再打印了，说明守护进程（myThread）也停止了
 */

/**
 * setDaemon(true)方法
 * 将线程设置为守护线程
 *
 * 当最后一个非守护线程结束时，守护线程才会结束
 */
public class Main {
    public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread();
            myThread.setDaemon(true);
            myThread.start();
            Thread.sleep(3000);
            System.out.println("我（main）结束后，myThread对象也不再打印了，说明守护进程（myThread）也停止了");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
