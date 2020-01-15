package chapter2.test27;

/**
 * main stop
 * Thread-0
 * Thread-0
 */

/**
 * 通过多线程去跳出死循环
 *
 * 书上说：
 * 此代码在-server服务器模式总64bit的JVM上时，会出现死循环，解决办法是使用volatile关键字...
 * 我尝试设置JVM参数为-server，并没有发生死循环，可能是JVM改进了，也可能是我设置VM参数有问题，待解决...
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        System.out.println("main stop");
        Thread.sleep(1000);
        printString.setContinuePrint(false);
    }
}
