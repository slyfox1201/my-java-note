package chapter2.test30;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(count.incrementAndGet());
        }
    }
}
