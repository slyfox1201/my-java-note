package chapter2.test30;

/**
 * ...
 * 44
 * 16
 * 45
 * 46
 * 47
 * 48
 * 49
 * 50
 */

/**
 * 测试原子类进行i++操作的结果，顺序也会出现问题，最终结果正确
 */
public class Main {
    public static void main(String[] args) {
        AddCountThread addCountThread = new AddCountThread();
        Thread t1 = new Thread(addCountThread);
        t1.start();
        Thread t2 = new Thread(addCountThread);
        t2.start();
        Thread t3 = new Thread(addCountThread);
        t3.start();
        Thread t4 = new Thread(addCountThread);
        t4.start();
        Thread t5 = new Thread(addCountThread);
        t5.start();
    }
}
