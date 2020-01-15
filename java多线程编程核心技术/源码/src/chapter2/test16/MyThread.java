package chapter2.test16;

public class MyThread extends Thread {
    private MyList myList;

    public MyThread(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myList.add("a");
        }
    }
}
