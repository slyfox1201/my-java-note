package chapter1.test21;

/**
 * 测试yield()方法
 * yield()方法使线程放弃当前cpu资源，但放弃的时间不确定，有可能刚刚放弃，又获得cpu时间片
 *
 * 没加yield()前
 * 用时： 3 毫秒
 *
 * 加了yield()后
 * 用时： 3633 毫秒
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
