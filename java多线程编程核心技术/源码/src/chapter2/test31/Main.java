package chapter2.test31;

/**
 * 未加synchronized
 * Thread-0 加了100之后的值是： 100
 * Thread-2 加了100之后的值是： 300
 * Thread-1 加了100之后的值是： 200
 * Thread-3 加了100之后的值是： 403
 * Thread-4 加了100之后的值是： 503
 * 505
 *
 * 加了synchronized
 * Thread-0 加了100之后的值是： 100
 * Thread-3 加了100之后的值是： 201
 * Thread-2 加了100之后的值是： 302
 * Thread-1 加了100之后的值是： 403
 * Thread-4 加了100之后的值是： 504
 * 505
 */

/**
 * 原子类在具有逻辑性的情况下输出的结果也具有随机性
 */
public class Main {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            MyThread[] array = new MyThread[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new MyThread(service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(MyService.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
