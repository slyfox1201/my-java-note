package chapter2.test4;

/**
 * methodB()未添加synchronized
 * begin methodA threadName= A
 * begin methodB threadName= B
 * methodB end
 * methodA end
 * 或者
 * begin methodA threadName= A
 * begin methodB threadName= B
 * methodA end
 * methodB end
 *
 * methodB()添加synchronized
 * begin methodA threadName= A
 * methodA end
 * begin methodB threadName= B
 * methodB end
 */

/**
 * A线程先持有object对象的lock锁，B线程可以以异步的方式调用object对象的非synchronized方法
 *
 * A线程先持有object对象的lock锁，B线程如果在这时调用object对象中的synchronized方法，则需要等待，也就是同步
 */
public class Main {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(myObject);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
