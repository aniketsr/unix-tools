package aniketsr.unixtools.head;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadOperationsTest {
    @Test
    public void testShowHeader() throws Exception {
        String text = "hi, sandesh!\nkatte\ngotilla??\ndonkey\nsandie\nnothing\nget Lost";
        String expected = "hi, sandesh!\nkatte\ngotilla??";
        HeadOperations head = new HeadOperations(text);

        String result = head.showHeader(3);

        assertEquals(expected,result);
    }
}
