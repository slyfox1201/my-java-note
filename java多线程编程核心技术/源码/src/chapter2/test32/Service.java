package chapter2.test32;

public class Service {
    private boolean isContinueRun = true;
    public void runMethod(){
        String anyString = new String();
        while (isContinueRun){
            synchronized (anyString){

            }
        }
        System.out.println("runMethod stop");
    }
    public void stopMethod(){
        isContinueRun = false;
    }
}
