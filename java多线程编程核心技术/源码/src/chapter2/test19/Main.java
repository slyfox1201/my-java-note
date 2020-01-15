package chapter2.test19;

/**
 * A begin
 * C begin
 * C end
 * A end
 * B begin
 * B end
 */

/**
 * synchronized static方法是对其所在的class类上锁，类锁与对象锁不同，A、B为类锁，C为对象锁，因此A、B两个线程同步，并与C线程异步
 * synchronized(Service.class)也可实现同样的效果，注意传参是Service.class，即类对象
 */
public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        ThreadC threadC = new ThreadC(service);
        threadA.setName("A");
        threadB.setName("B");
        threadC.setName("C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
