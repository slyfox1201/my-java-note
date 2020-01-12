package chapter2.test7;

public class Sub extends Super {
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateISuperMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
