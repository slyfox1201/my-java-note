package chapter2.test29;

/**
 * addCount()方法未加synchronized
 * count = 20
 * count = 40
 * count = 30
 * count = 20
 * count = 50
 * count = 60
 * count = 70
 * count = 80
 * count = 90
 * count = 100
 *
 * 加了synchronized
 * count = 10
 * count = 20
 * count = 30
 * count = 40
 * count = 50
 * count = 60
 * count = 70
 * count = 80
 * count = 90
 * count = 100
 */

/**
 * 书上为了说明volatile的非原子性给出了这个实例，在未加synchronized时，count最终结果不是100，而是一个不正确的值，
 * 但是我跑完的结果是正确的， 原因不明...
 * 书上结论：
 * volatile本身并不处理数据的原子性，而i++这个操作是非原子性的；
 * volatile只是强制对数据的读写及时影响到内存
 */
public class Main {
    public static void main(String[] args) {
        MyThread[] myThreadArray = new MyThread[10];
        for (int i=0; i<10; i++){
            myThreadArray[i] = new MyThread();
        }
        for (int i=0; i<10; i++){
            myThreadArray[i].start();
        }
    }
}
