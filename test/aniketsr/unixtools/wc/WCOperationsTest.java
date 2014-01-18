package aniketsr.unixtools.wc;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WCOperationsTest {
    @Test
    public void testCountLines() throws Exception {
        String text = "Hi, whats up...\nhow are you";
        WCOperations operations = new WCOperations(text);

        int result = operations.countLines();
        assertEquals(1,result);
    }

    @Test
    public void testCountWords() throws Exception {
        String text = "Hi, whats up...\nhow are you";
        WCOperations operations = new WCOperations(text);

        int result = operations.countWords();
        assertEquals(5,result); // wrong asserted
    }

    @Test
    public void testCountChars() throws Exception {
        String text = "Hi, whats up...\nhow are you";
        WCOperations operations = new WCOperations(text);

        int result = operations.countChars();
        assertEquals(27,result);
    }
}
