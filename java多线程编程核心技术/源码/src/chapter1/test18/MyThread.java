package chapter1.test18;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try{
            for(int i=0; i<50000; i++){
                if(this.isInterrupted()) {
                    System.out.println("已经是停止状态了，我要退出了");
                    throw new InterruptedException();
                }
                System.out.println("i=" + i);
            }
            System.out.println("我在for下面");
        } catch (InterruptedException e){
            System.out.println("进入MyThread.java类的run方法中的catch了");
            // 注释掉此句就不会打印错误信息了
            e.printStackTrace();
        }
    }
}
