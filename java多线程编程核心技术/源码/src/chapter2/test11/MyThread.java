package chapter2.test11;

public class MyThread extends Thread {
    private ObjectService objectService;

    public MyThread(ObjectService objectService) {
        super();
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethod();
    }
}
