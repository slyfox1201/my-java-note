package chapter2.test7;

public class Super {
    public int i = 10;

    synchronized public void operateISuperMethod() {
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
