package aniketsr.unixtools.tail;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TailOperationsTest {
    @Test
    public void testShowHeader() throws Exception {
        String text = "hi, sandesh!\nkatte\ngotilla??\ndonkey\nsandie\nnothing\nget Lost";
        String expected = "gotilla??\ndonkey\nsandie\nnothing\nget Lost";
        TailOperations head = new TailOperations(text);

        String result = head.showTail(5);

        assertEquals(expected,result);
    }
}
