package chapter1.test4;

/**
 * 通过实现Runnable来创建线程
 *
 * 构造函数Thread(Runnable target)不光可以传入Runnable接口的对象，还可以传入一个Thread类的对象，这样做完全可以将一个Thread对象中的run()方法交由其他的线程进行调用
 */
public class Main {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束...");
    }
}
