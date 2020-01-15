package chapter2.test18;

/**
 * A begin
 * A end
 * B begin
 * B end
 */

/**
 * 当其他线程执行锁对象myObject中的synchronized同步方法（或synchronized(this)同步代码块）时，呈同步效果；
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(service, myObject);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("B");
        threadA.start();
        threadA.sleep(200);
        threadB.start();
    }
}
