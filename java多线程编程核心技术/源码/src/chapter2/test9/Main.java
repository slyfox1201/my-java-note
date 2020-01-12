package chapter2.test9;

/**
 * begin super method= A
 * end super method= A
 * begin super method= B
 * end super method= B
 */

/**
 * 书上重写了父类的方法，我认为应该保持Sub为空，才能验证子类能否继承父类的synchronized方法
 *
 * 经验证子类可以继承父类的synchronized方法（书上说不可以，我觉得可以！）
 */
public class Main {
    public static void main(String[] args) {
        Sub sub = new Sub();
        MyThread myThreadA = new MyThread(sub);
        MyThread myThreadB = new MyThread(sub);
        myThreadA.setName("A");
        myThreadB.setName("B");
        myThreadA.start();
        myThreadB.start();
    }
}
