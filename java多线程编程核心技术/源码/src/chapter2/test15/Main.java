package chapter2.test15;

/**
 * set begin A
 * set end A
 * set begin B
 * set end B
 */

/**
 * 将别的对象当做锁，不同对象锁对应的线程之间异步
 */
public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
