package chapter2.test11;

/**
 * begin time = 1578885485569----A
 * end time = 1578885487571----A
 * begin time = 1578885487571----B
 * end time = 1578885489571----B
 */

/**
 * 使用同步代码块来实现同步效果
 */
public class Main {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        MyThread myThreadA = new MyThread(objectService);
        myThreadA.setName("A");
        MyThread myThreadB = new MyThread(objectService);
        myThreadB.setName("B");
        myThreadA.start();
        myThreadB.start();
    }
}
