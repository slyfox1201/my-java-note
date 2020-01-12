package chapter1.test23;

import java.util.Random;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                // 我觉得下面两行代码是用来拖时间的...以扩大不同优先级线程之间的速度差距，跟容易观测结果
                Random random = new Random();
                random.nextInt();
                addResult += i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("☆ ☆ ☆ ☆ ☆ thread 2 use time=" + (endTime - beginTime));
    }
}
