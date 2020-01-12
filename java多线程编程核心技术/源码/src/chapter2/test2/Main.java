package chapter2.test2;

/**
 * 不加synchronized
 * a set over!
 * b set over!
 * username= b num= 200
 * username= a num= 200
 *
 *
 * 加了synchronized
 * a set over!
 * username= a num= 100
 * b set over!
 * username= b num= 200
 */

/**
 * 多个线程访问同一个对象中的实例变量，则有可能出现“非线程安全”问题
 *
 * 多个线程访问同一个对象中的同步方法，一定是线程安全的
 */
public class Main {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();

        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
