package chapter2.test7;

/**
 * sub print i=9
 * main print i=8
 * sub print i=7
 * main print i=6
 * sub print i=5
 * main print i=4
 * sub print i=3
 * main print i=2
 * sub print i=1
 * main print i=0
 */

/**
 * 可重入锁支持在父子类继承的环境中，子类可以通过可重入锁来调用父类的同步方法
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
