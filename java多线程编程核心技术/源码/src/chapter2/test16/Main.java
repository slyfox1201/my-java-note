package chapter2.test16;

/**
 * A 执行了add方法！
 * A 退出了add方法！
 * B 执行了add方法！
 * B 退出了add方法！
 * B 执行了add方法！
 * B 退出了add方法！
 * ...
 */

/**
 * 证明多个线程调用同一个synchronized方法时，虽然同步，但是随机
 * 在调用这个方法时是同步的，但是两个线程之间是异步的
 *
 * 我认为是for循环显示出了这种异步性，之前的所有案例都是对单次方法的执行进行同步性验证，
 * 最后的结果只展示了当一个线程A进入同步方法时，不允许另一个线程B进入该方法；但是AB两个
 * 线程可能会多次去调用这个同步方法，在这去调用的过程中，谁先谁后是随机的，如上述结果所
 * 示，AB轮流进入方法，这可以称作是异步吗？我觉得应该可以...
 */
public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        MyThread myThreadA = new MyThread(myList);
        myThreadA.setName("A");
        MyThread myThreadB = new MyThread(myList);
        myThreadB.setName("B");
        myThreadA.start();
        myThreadB.start();
    }
}
