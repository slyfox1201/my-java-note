package chapter2.test12;

/**
 * test10结果
 * begin task
 * getData1 threadName = Thread-0
 * getData2 threadName = Thread-0
 * end task
 * begin task
 * getData1 threadName = Thread-1
 * getData2 threadName = Thread-1
 * end task
 * 耗时： 4
 *
 * test12结果
 * begin task
 * begin task
 * getData1 threadName = Thread-0
 * getData2 threadName = Thread-0
 * end task
 * getData1 threadName = Thread-1
 * getData2 threadName = Thread-1
 * end task
 * 耗时： 2
 */

/**
 * synchronized方法弊端：执行长任务时耗时严重
 *
 * synchronized代码块优势：将长任务异步，只同步赋值操作，节省时间
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 myThread1 = new MyThread1(task);
        MyThread2 myThread2 = new MyThread2(task);
        myThread1.start();
        myThread2.start();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = Math.max(CommonUtils.beginTime1, CommonUtils.beginTime2);
        long endTime = Math.max(CommonUtils.endTime1, CommonUtils.endTime2);
        System.out.println("耗时： " + (endTime - beginTime) / 1000);
    }
}
