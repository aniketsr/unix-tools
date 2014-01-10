package aniketsr.unixtools.uniq;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqOperationsTest {
    @Test
    public void testGiveUniqLines() throws Exception {
        String text = "a\na\nb\nc\nd\nd\na\ne";
        String expected = "a\nb\nc\nd\na\ne";
        UniqOperations uniq = new UniqOperations(text);

        String result = uniq.giveUniqLines();

        assertEquals(expected, result);
    }
}
