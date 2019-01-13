package api;

import java.io.InputStream;


public interface Server {

    void search(String fileName);
    boolean download ();
    void close();
    void list();
    void getStatus();

}
