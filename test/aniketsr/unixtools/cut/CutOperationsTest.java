package aniketsr.unixtools.cut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CutOperationsTest {
    @Test
    public void testGetSpecificFeild() throws Exception {
        String text = "a b c d\ne f g h\ni j k l";
        String expected = "c\ng\nk";
        CutOperations cut = new CutOperations();

        String result = cut.getSpecificFeild(3,text," ");

        assertEquals(expected,result);
    }
}
