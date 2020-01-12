package chapter1.test7;

public class BLogin extends  Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
