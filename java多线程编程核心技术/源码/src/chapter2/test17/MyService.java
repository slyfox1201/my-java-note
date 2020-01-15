package chapter2.test17;

public class MyService {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
//            if (list.getSize() < 1) {
//                Thread.sleep(1000);
//                list.add(data);
//            }
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(1000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
