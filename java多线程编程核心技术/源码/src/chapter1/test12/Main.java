package chapter1.test12;

/**
 * Thread.currentThread().isAlive()和this.isAlive()在run方法中时值不一样，同时Thread.currentThread().getName()为A，而和this.getName()为Thread-0
 *
 * 我的理解：因为countOperate线程(Thread-0)外包装了一层线程t1(A),所以会有以上情况的发生
 */
public class Main {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread t1 = new Thread(countOperate);
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }
}
