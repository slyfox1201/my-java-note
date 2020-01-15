package chapter2.test25;

/**
 * A begin
 * B begin
 * A end
 * B end
 * ______________
 * A begin
 * A end
 * B begin
 * B end
 */

/**
 * 锁对象没来得及变更，A、B同步
 *
 * 我觉得这个例子不够严谨，及时同时start()也不能完全保证锁对象没有变更...因为本书所设计的程序在取得锁的一瞬间，
 * 就会去变更锁，具体见代码，修改方案没去想，先这样吧
 */

public class Main2 {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread myThreadA = new MyThread(myService);
        MyThread myThreadB = new MyThread(myService);
        myThreadA.setName("A");
        myThreadB.setName("B");
        myThreadA.start();
        myThreadB.start();
    }
}
