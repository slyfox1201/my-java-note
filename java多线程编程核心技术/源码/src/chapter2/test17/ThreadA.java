package chapter2.test17;

public class ThreadA extends Thread {
    private MyOneList list;

    public ThreadA(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list, "A");
    }
}
