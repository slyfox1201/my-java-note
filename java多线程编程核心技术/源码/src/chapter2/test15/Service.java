package chapter2.test15;

public class Service {
    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        try {
            synchronized (anyString) {
                System.out.println("set begin " + Thread.currentThread().getName());
                usernameParam = username;
                Thread.sleep(1000);
                passwordParam = password;
                System.out.println("set end " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
