package chapter1.test17;

/**
 * i=29191
 * i=29192
 * end!
 * 已经是停止状态了，我要退出了
 * 我被输出，如果此处为for循环，则线程仍然会继续...
 */

/**
 * 检测this.isInterrupted()后，单纯的break跳出循环是不能彻底结束线程的，线程还是可能陷入后面存在的循环
 */
public class Main {
    public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(200);
            myThread.interrupt();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
