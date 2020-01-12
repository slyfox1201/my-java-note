package chapter1.test14;

/**
 * getId()方法
 *
 * 获取线程的唯一标识符
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
    }
}
