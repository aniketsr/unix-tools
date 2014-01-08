package aniketsr.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WCOperationsTest {
    @Test
    public void testCountLines() throws Exception {
        String text = "Hi, whats up...\nhow are you";
        WCOperations operations = new WCOperations();

        int result = operations.countLines(text);
        assertEquals(2,result);

    }

    @Test
    public void testCountWords() throws Exception {

    }

    @Test
    public void testCountChars() throws Exception {

    }
}
