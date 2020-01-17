package chapter3.test1;

/**
 *
 * 添加了 1个元素
 * b
 * ...
 * b
 * 添加了 5个元素
 * ==5了,线程B要退出了
 * java.lang.InterruptedException
 * 	at chapter3.test1.ThreadB.run(ThreadB.java:18)
 * 	...
 * 添加了 10个元素
 */

/**
 * 简易实现线程间通信
 *
 * 线程B一直处于while循环，浪费cpu资源
 * ps：while循环中有一句 System.out.println("b"); 不加这一句的话，if内的语句永远不会访问，不知道是为什么
 * 猜测：
 * 在多线程环境下，某线程的while(true)循环中如果不存在必然执行的语句，那么while循环中的变量就只会读取工作内存数据，无法获取公共内存的变化
 * 猜测应该是正确的，详见MyList代码
 */
public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA threadA = new ThreadA(myList);
        ThreadB threadB = new ThreadB(myList);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
