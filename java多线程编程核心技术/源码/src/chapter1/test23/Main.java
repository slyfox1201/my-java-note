package chapter1.test23;

/**
 * ★ ★ ★ ★ ★ thread 1 use time=132
 * ★ ★ ★ ★ ★ thread 1 use time=229
 * ☆ ☆ ☆ ☆ ☆ thread 2 use time=166
 * ★ ★ ★ ★ ★ thread 1 use time=300
 * ★ ★ ★ ★ ★ thread 1 use time=311
 * ★ ★ ★ ★ ★ thread 1 use time=316
 * ☆ ☆ ☆ ☆ ☆ thread 2 use time=222
 * ☆ ☆ ☆ ☆ ☆ thread 2 use time=135
 * ☆ ☆ ☆ ☆ ☆ thread 2 use time=223
 * ☆ ☆ ☆ ☆ ☆ thread 2 use time=224
 */

import java.util.Random;

/**
 * 测试优先级
 * 优先级定义从 1 到 10 ，数字越大，优先级越高
 */
public class Main {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            MyThread1 myThread1 = new MyThread1();
            MyThread2 myThread2 = new MyThread2();
            myThread1.setPriority(10);
            myThread1.start();
            myThread2.setPriority(1);
            myThread2.start();
        }
    }
}
