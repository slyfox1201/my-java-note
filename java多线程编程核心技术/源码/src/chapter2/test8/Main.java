package chapter2.test8;

/**
 * begin ThreadName= A
 * Exception in thread "A" java.lang.NumberFormatException: For input string: "a"
 * 	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 	at java.lang.Integer.parseInt(Integer.java:580)
 * 	at java.lang.Integer.parseInt(Integer.java:615)
 * 	at chapter2.test8.Service.testMethod(Service.java:9)
 * 	at chapter2.test8.MyThread.run(MyThread.java:12)
 * begin ThreadName= B
 * end ThreadName= B
 */

/**
 * 线程A出现异常，会导致A释放锁，因此线程B能进入方法正常打印
 */
public class Main {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread myThreadA = new MyThread(service);
            MyThread myThreadB = new MyThread(service);
            myThreadA.setName("A");
            myThreadB.setName("B");
            myThreadA.start();
            Thread.sleep(500);
            myThreadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
