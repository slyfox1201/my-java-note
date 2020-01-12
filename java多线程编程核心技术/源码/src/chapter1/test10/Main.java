package chapter1.test10;

/**
 * 线程的this.getName()方法
 * 承接上一个例子，此处this.getName()始终为Thread-0
 */
public class Main {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        thread.setName("A");
        thread.start();
    }
}
