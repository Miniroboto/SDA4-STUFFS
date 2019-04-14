import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ReceiverThread implements Runnable {
   SocketChannel socket;

    ReceiverThread(SocketChannel socket){
        this.socket=socket;

    }
    @Override
    public void run() {

        ByteBuffer bufferReceive= ByteBuffer.allocate(256);

        while (true){
        //wait for an answer from server
            bufferReceive.clear();
            try {
                socket.read(bufferReceive);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //afisare mesaj primit de la server
        System.out.println(new String(bufferReceive.array()));}

    }


}
