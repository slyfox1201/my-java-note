package chapter3.test1;

public class ThreadB extends Thread {
    private MyList myList;

    public ThreadB(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("b");

                if (myList.size() == 5) {
                    System.out.println("==5了,线程B要退出了");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
