package chapter2.test13;

/**
 * no synchronized thread name = Thread-0 i = 0
 * no synchronized thread name = Thread-1 i = 0
 * no synchronized thread name = Thread-1 i = 1
 * no synchronized thread name = Thread-1 i = 2
 * no synchronized thread name = Thread-1 i = 3
 * no synchronized thread name = Thread-1 i = 4
 *
 * synchronized thread name = Thread-1 i = 0
 * synchronized thread name = Thread-1 i = 1
 * synchronized thread name = Thread-1 i = 2
 * synchronized thread name = Thread-1 i = 3
 * synchronized thread name = Thread-1 i = 4
 * no synchronized thread name = Thread-0 i = 1
 * no synchronized thread name = Thread-0 i = 2
 * no synchronized thread name = Thread-0 i = 3
 * no synchronized thread name = Thread-0 i = 4
 *
 * synchronized thread name = Thread-0 i = 0
 * synchronized thread name = Thread-0 i = 1
 * synchronized thread name = Thread-0 i = 2
 * synchronized thread name = Thread-0 i = 3
 * synchronized thread name = Thread-0 i = 4
 */

/**
 * 不在synchronized块中的就是异步执行，在synchronized中的就是同步执行
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread myThreadA = new MyThread(task);
        MyThread myThreadB = new MyThread(task);
        myThreadA.start();
        myThreadB.start();
    }
}
