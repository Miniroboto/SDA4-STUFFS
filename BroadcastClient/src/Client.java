import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Client {
    private String host;
    private int port;
    private SocketChannel socket;

    public Client(String host, int port ){
        this.host= host;
        this.port= port;
        socket= null;
        }

    public void start() throws IOException {
        //connecting to server with the mentioned IP and port, using TCP (complete messsge delivery)
        try {
            socket = SocketChannel.open(new InetSocketAddress(host, port));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        // "the mailbox" - the place where we receive messages arrived from server
        ByteBuffer buffer= ByteBuffer.allocate(256);
        //start the listen Thread
        Thread listen = new Thread(new ReceiverThread(socket));
        listen.start();

        while (true)
        {
            //receive a message from keyboard
            String msg = sc.nextLine();
            //send to server
            socket.write(ByteBuffer.wrap(msg.getBytes()));



        }

    }
}

