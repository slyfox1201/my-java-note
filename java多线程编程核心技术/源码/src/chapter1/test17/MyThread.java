package chapter1.test17;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0; i<50000; i++) {
            if(this.isInterrupted()) {
                System.out.println("已经是停止状态了，我要退出了");
                break;
            }
            System.out.println("i=" + (i+1));
        }
        System.out.println("我被输出，如果此处为for循环，则线程仍然会继续...");
    }
}
