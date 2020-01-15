package chapter2.test24;

/**
 * A InnerClass1 method1 begin
 * B InnerClass1 method2 begin
 * A InnerClass1 method1 end
 * B InnerClass1 method2 end
 * C InnerClass2 method2 begin
 * C InnerClass2 method2 end
 */

/**
 * A线程的锁使用了C线程对应的对象实例，因此A,C同步；A,C与B锁对象不同，因此A,C与B异步
 */
public class Main {
    public static void main(String[] args) {
        final OutClass.InnerClass1 in1 = new OutClass.InnerClass1();
        final OutClass.InnerClass2 in2 = new OutClass.InnerClass2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();
            }
        });

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");

        t1.start();
        t2.start();
        t3.start();
    }
}
