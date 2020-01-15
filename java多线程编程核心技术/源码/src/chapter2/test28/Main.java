package chapter2.test28;

/**
 * while(true)内为空
 * run begin
 * 已经赋值为false
 * ...（死循环）
 *
 * while(true)内不为空
 * run begin
 * h
 * h
 * ...
 * h
 * 已经赋值为false
 * run end
 */

/**
 * 承接上例
 * 经测试，死循环while(true)内为空时，会陷入死循环；当while(true)内存在打印语句是，可以跳出死循环，具体原因不明，
 * 暂时没有发现与JVM参数的关系
 *
 * 死循环原因（书上针对-server模式，我觉得适用于当前情况）：
 * 线程的私有堆栈中存在的isRunning的值一直未true，而runThread.setRunning(false);
 * 语句更新的是公共堆栈中的isRunning，所以循环不会跳出
 *
 * 解决方法：
 * 在isRunning定义前加上volatile关键字
 * 经测验，有效！~~~~
 *
 * volatile关键字，强制从公共内存中读取变量的值，但注意volatile关键字不支持原子性
 */
public class Main {
    public static void main(String[] args) {
        try {
            RunThread runThread = new RunThread();
            new Thread(runThread).start();
            Thread.sleep(1000);
            runThread.setRunning(false);
            System.out.println("已经赋值为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
