package chapter3.test8;

public class Subtract {
    private final String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract() {
        try {
            synchronized (lock) {
//                if (ValueObject.list.size() == 0){
                while (ValueObject.list.size() == 0){
                    System.out.println("wait begin " + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end " + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size = " + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
