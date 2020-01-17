package chapter3.test4;

public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("wait begin");
                lock.wait();
                System.out.println("wait end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
