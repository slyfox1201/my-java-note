package chapter3.test1;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List<String> list = new ArrayList<>();

    public void add() {
        list.add("first");
    }

    public int size() {
        return list.size();
    }
}

/**
 * ----出现了书上的结果----
 * 添加了 4个元素
 * 添加了 5个元素
 * ==5了,线程B要退出了
 * java.lang.InterruptedException
 * 	at chapter3.test1.ThreadB.run(ThreadB.java:17)
 * 添加了 6个元素
 * 添加了 7个元素
 */
//public class MyList {
//    private List<String> list = new ArrayList<>();
//    private volatile int size;
//
//    public void add() {
//        list.add("first");
//    }
//
//    public int size() {
//        size = list.size();
//        return size;
//    }
//}

