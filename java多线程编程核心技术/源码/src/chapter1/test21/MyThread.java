package chapter1.test21;

public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for(int i=0; i<5000000; i++){
            yield();
            count += (i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时： " + (endTime - beginTime) + " 毫秒");
    }
}
