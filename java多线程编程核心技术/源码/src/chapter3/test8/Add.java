package chapter3.test8;

public class Add {
    private final String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("first");
            lock.notifyAll();
        }
    }
}
