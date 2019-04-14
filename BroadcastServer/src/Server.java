import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;

public class Server {

    ServerSocketChannel serverSocket;
    private int port;

    public Server (int port){
        this.port=port;
        //access is denied at this time.
        serverSocket=null;

    }
    public void start() throws IOException {
        //alowing access
        serverSocket = ServerSocketChannel.open();
        //we can't allow clients as we did not mention the port yet
        //nonBlocking inseama ca pot trimite/primi date fara ca partenerul sa fie neaparat pe faza
        serverSocket.configureBlocking(false);
        //asociem socket-ul cu portul ales si acceptam orice client (0.0.0.0 inseamna fara discriminare)
        serverSocket.bind(new InetSocketAddress("0.0.0.0", port));

        //the selector is the one who listen for any incoming message

        Selector selector = Selector.open();

        //inregistrez singurul socket existent deocamdata la selector cu mentiunea ca activiteaa ascultata pe acest socket
        //este de una tip "acceptare noi conexiuni"
        serverSocket.register(selector, SelectionKey.OP_ACCEPT);

        while (true){

            //ii cer selectorului sa monitorizeze toti socketii inregistrati si sa stea degeaba
            //cat timp nu exista nici o activitate; iar in cazul in care ceva se intampla cu vreun socket
            //selectorul sa se trezeasca

            selector.select();

            //selectorul imi comunica o lista cu socketiii pe care a detectat activitate
            Set<SelectionKey> selectedKeys = selector.selectedKeys();
            //parcurg lista de socketi pentru a procesa activitaile

            for (SelectionKey key : selectedKeys)
            {   // un client nou bate la usa asa ca trebuie primit
                if (key.isAcceptable()){
                    acceptNewClient(selector, serverSocket);
                }
                // un client existent spune ceva si il ascultam
                if (key.isReadable()){
                    getMSGAndBroadcast(key, selector);
                }


            }
            //anunt selectorul ca aceste activitati au fost luate in seama
            selectedKeys.clear();

        }
    }



    public void acceptNewClient(Selector s, ServerSocketChannel serverSocket) throws IOException {
        //acceptand clientul obtin o cale privata dedicata de a comunica cu el, adica un SocketChanel
        SocketChannel freshNewSocket = serverSocket.accept();
        freshNewSocket.configureBlocking(false);
        //inregistram noul socket cu interesul de a citi date de pe el
        freshNewSocket.register(s, SelectionKey.OP_READ);

    }

    private void getMSGAndBroadcast(SelectionKey key, Selector selector) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(256);
        SocketChannel client = (SocketChannel) key.channel();
        //TODO cand un client isi termina executia, serverul va avea de suferit, iar urmatoarea linie
        // de cod va arunca o exceptie care va avea ca efect oprirea completa a serverului. Tratarea exceptiei
        //este necesara pentru ca serverul sa nu moara niciodata
        client.read(buffer);
        String msg = new String(buffer.array());
        System.out.println(msg);
        for (SelectionKey keke: selector.keys())
        { //toti clientii existenti cu exceptia intrarii
            //TODO cand un client isi termina executia, cheia lui devine invalida
            if (keke.isValid()&& keke.isAcceptable()==false)
            {
                SocketChannel client1 = (SocketChannel) keke.channel();
                client1.write(ByteBuffer.wrap(msg.getBytes()));
            }
        }



    }

}
