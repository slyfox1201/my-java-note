package chapter2.test18;

public class ThreadA extends Thread {
    private Service service;
    private MyObject myObject;

    public ThreadA(Service service, MyObject myObject) {
        this.service = service;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod(myObject);
    }
}
