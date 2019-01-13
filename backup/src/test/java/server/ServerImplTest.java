package server;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServerImplTest {
    @Test
    public void itDownloadACopyOfTheStream(){

        //Give
        ServerImpl systemUnderTest = new ServerImpl();

        //When

        boolean result = systemUnderTest.download();

        //Then
        assertTrue(result);
    }


}