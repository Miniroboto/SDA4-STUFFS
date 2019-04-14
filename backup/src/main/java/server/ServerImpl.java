package server;

import api.Server;
import jdk.internal.util.xml.impl.Input;
import utils.Status;


import java.io.IOException;
import java.io.InputStream;
import java.util.*;



public class ServerImpl implements Server {

    private List<String> filesContents = new LinkedList<String>();
    Status status= Status.OFF;


    public boolean search(String fileName) {

        if (filesContents == null){
            return false;
        }
        Optional<String> foundElement = filesContents.stream()
                .filter(existingItem -> existingItem.equals(filesContents))
                .findFirst();
        return foundElement.isPresent();


    }

    public boolean download(InputStream file) {

        if (file == null) {
            return false;
        }
        byte[] contents = new byte[1024];

        int bytesRead = 0;
        String strFileContents = "";
        try {
            while ((bytesRead = file.read(contents)) != -1) {
                strFileContents += new String(contents, 0, bytesRead);
            }
            file.close();


        } catch (IOException ioException) {
            return false;

        }
        System.out.println(strFileContents);
        filesContents.add(strFileContents);
        return true;
    }

    public  close() {
        status = Status.OFF;
        System.out.println("Server is OFF");

    }

    public void list() {

    }

    public void getStatus() {
        System.out.println("Server status is " + status);


    }

    public void open () {
        status = Status.ON;
        System.out.println("Server is ON");

    }


}