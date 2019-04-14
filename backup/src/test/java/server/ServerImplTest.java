package server;

import org.junit.Test;


import java.io.*;

import static org.junit.Assert.*;

public class ServerImplTest {
    @Test
    public void itDownloadACopyOfTheStream()throws IOException {

        //Give
        ServerImpl systemUnderTest = new ServerImpl();

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File (classLoader.getResource("myData.txt").getFile());
        InputStream fileStream = new FileInputStream( file);

        //When

        boolean result = systemUnderTest.download(fileStream);

        //Then
        assertTrue(result);
    }

    @Test
    public void itFailstoDownloadFileWhneInputIsNull() throws IOException{

        //Given
        ServerImpl systemUnderTest = new ServerImpl();

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File (classLoader.getResource("myData.txt").getFile());
        InputStream fileStream = new FileInputStream( file);

        //When
        boolean result = systemUnderTest.download(null);

        //Then
        assertFalse(result);
    }

    @Test
    public void itFindsTheGivenFileCOntentsonTheServers () {
        //Given
        ServerImpl systemUnderTest = new ServerImpl();

        //When
        boolean result = systemUnderTest.search("123");

        //Then
        assertTrue(result);
    }


}