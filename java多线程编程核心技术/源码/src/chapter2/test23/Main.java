package chapter2.test23;

/**
 * PublicClass{username='sly fox', password='123456'}
 * PrivateClass{age='24', address='bei hang'}
 */

/**
 * 静态内部类
 */
public class Main {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("sly fox");
        publicClass.setPassword("123456");
        System.out.println(publicClass);

        PublicClass.PrivateClass privateClass = new PublicClass.PrivateClass();
        privateClass.setAge("24");
        privateClass.setAddress("bei hang");
        System.out.println(privateClass);
    }
}
