package chapter2.test3;

/**
 * a set over!
 * b set over!
 * username= b num= 200
 * username= a num= 100
 */

/**
 * 两个线程分别访问同一个类的两个不同实例的相同名称的方法，结果是异步的
 *
 * 原因：synchronized取得的锁是对象锁，多个对象即存在多个锁，不同的锁之间不会同步，即异步
 */
public class Main {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();

        ThreadA threadA = new ThreadA(numRef1);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef2);
        threadB.start();
    }
}
