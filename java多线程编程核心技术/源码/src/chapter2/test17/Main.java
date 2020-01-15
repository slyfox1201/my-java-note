package chapter2.test17;

/**
 * 未同步调用list的getSize()方法
 * list size = 2
 *
 * 同步后
 * list size = 1
 */

/**
 * 承接上文；
 * 由于线程的执行方法顺序的不确定性，当A和B两个线程执行带有分支判断的方法时，就会出现逻辑上的错误；
 * list size = 2 就是因为两个线程以异步的方式调用了getSize()方法
 * 虽然getSize()方法是同步方法，但是可以被两个线程以异步的方式调用
 *
 * 我的理解：脏读出现的原因是因为两个线程之间是异步的，从而导致了调用异步，同步方法还是那个同步方法...
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyOneList myOneList = new MyOneList();
        ThreadA threadA = new ThreadA(myOneList);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(myOneList);
        threadB.setName("B");
        threadB.start();
        Thread.sleep(3000);
        System.out.println("list size = " + myOneList.getSize());
    }
}
