package chapter2.test5;

/**
 * 脏读
 * getValue method thread name= main username= B password= AA
 * setValue method thread name= Thread-0 username= B password= BB
 */

/**
 * 避免
 * 在getValue()方法前加上synchronized
 */
public class Main {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(200);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
