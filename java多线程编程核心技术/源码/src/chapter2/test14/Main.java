package chapter2.test14;

/**
 * A begin
 * A end
 * B begin
 * B end
 */

/**
 * synchronized(this)代码块和synchronized方法一样，都是锁定的当前对象
 */
public class Main {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        ThreadA threadA = new ThreadA(objectService);
        ThreadB threadB = new ThreadB(objectService);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
