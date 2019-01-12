package api;

import java.io.InputStream;


public interface Server {

    void search(String fileName);
    void download (InputStream fileName);
    void close();
    void list();
    void getStatus();

}
