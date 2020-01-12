package chapter1.test2;

/**
 * 证明系统调用的随机性
 */
public class Main {
    public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.start();
            for (int i=0; i<10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
