import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Client wap =new Client("192.168.0.162", 14000);
        wap.start();

    }
}
