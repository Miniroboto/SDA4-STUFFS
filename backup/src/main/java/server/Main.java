package server;



public class Main {

    public static void main(String[] args) {


        ServerImpl server1 = new ServerImpl();
        server1.getStatus();
        server1.open();
        server1.download(null);

    }
}
