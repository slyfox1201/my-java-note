package chapter1.test24;

/**
 * a=1129011801
 * b=1306862267
 */

/**
 * 比较不同优先级的线程的运行速度
 */
public class Main {
    public static void main(String[] args) {
        try{
            MyThread threadA = new MyThread();
            MyThread threadB = new MyThread();
            threadA.setPriority(Thread.NORM_PRIORITY - 3);
            threadB.setPriority(Thread.NORM_PRIORITY + 3);
            threadA.start();
            threadB.start();
            Thread.sleep(2000);
            threadA.stop();
            threadB.stop();
            System.out.println("a=" + threadA.getCount());
            System.out.println("b=" + threadB.getCount());
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
