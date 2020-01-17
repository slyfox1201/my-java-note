package chapter3.test8;

/**
 * Subtract 为 while:
 * wait begin sub1
 * wait begin sub2
 * wait end sub2
 * list size = 0
 * wait end sub1
 * wait begin sub1 注意这一行！
 *
 * Subtract 为 if:
 * wait begin sub1
 * wait begin sub2
 * wait end sub2
 * list size = 0
 * wait end sub1
 * Exception in thread "sub1" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
 * 	at java.util.ArrayList.rangeCheck(ArrayList.java:657)
 * 	at java.util.ArrayList.remove(ArrayList.java:496)
 * 	at chapter3.test8.Subtract.subtract(Subtract.java:19)
 * 	at chapter3.test8.ThreadSubtract.run(ThreadSubtract.java:12)
 */

/**
 * wait等待条件发生了变化，容易导致程序逻辑混乱
 * 其中改为while很巧妙，只允许一个线程跳出while循环，另一个线程再次wait，防止对空队列进行remove
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);

        ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
        threadSubtract1.setName("sub1");
        threadSubtract1.start();

        ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
        threadSubtract2.setName("sub2");
        threadSubtract2.start();

        Thread.sleep(1000);

        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("add");
        threadAdd.start();
    }
}
