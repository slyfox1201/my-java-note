package chapter2.test9;

public class Sub extends Super {
    //书上重写了父类的方法，我认为应该保持Sub为空，才能验证子类能否继承父类的synchronized方法
//    @Override
//    public void serviceMethod() {
//        try {
//            System.out.println("begin sub method= " + Thread.currentThread().getName());
//            Thread.sleep(2000);
//            System.out.println("end sub method= " + Thread.currentThread().getName());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
