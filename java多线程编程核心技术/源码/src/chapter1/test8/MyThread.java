package chapter1.test8;

/**
 * 2015版书上说：虽然println函数在内部是同步的，但i--的操作确实在进入println之前发生的，所以有发生非线程安全问题的概率，所以应使用同步方法
 *
 * 2019但是我运行后并没有发现该问题，待验证
 */
public class MyThread extends Thread {
    private int i = 5;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }
}
