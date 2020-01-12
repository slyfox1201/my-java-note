package chapter2.test1;

/**
 * a set over!
 * b set over!
 * username= b num= 200
 * username= a num= 100
 */

/**
 * 方法内部的私有变量不存在“非线程安全”问题
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
