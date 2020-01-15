package chapter2.test32;

/**
 * 未加synchronized代码块
 * main stop
 * ...(死循环)
 *
 * 加了后
 * main stop
 * runMethod stop
 *
 * Process finished with exit code 0
 */

/**
 * 此例给出了synchronized的另一个功能，即和volatile一样的同步功能
 */
public class Main {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            ThreadB threadB = new ThreadB(service);
            threadA.start();
            Thread.sleep(1000);
            threadB.start();
            System.out.println("main stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
