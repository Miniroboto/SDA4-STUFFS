package api;

import java.io.IOException;
import java.io.InputStream;


public interface Server {

    boolean search(String fileContent);
    boolean download (InputStream file);
    void close();
    void list();
    void getStatus();
    void open();

}
