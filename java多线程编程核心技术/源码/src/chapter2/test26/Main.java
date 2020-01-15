package chapter2.test26;

/**
 * main
 * main
 * main
 * main
 * ...(一直打印)
 */

/**
 * 单线程无法去主动停止死循环，main线程无法执行到 printString.setContinuePrint(false); 这一行
 */
public class Main {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("main stop");
        printString.setContinuePrint(false);
    }
}
