package aniketsr.unixtools.SpaceReduce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpaceReduceOperationsTest {
    @Test
    public void testReduceSpaces() throws Exception {
        String text = "a   a b\nc d   e";
        String expected = "a a b\nc d e";
        SpaceReduceOperations reduce = new SpaceReduceOperations();

        String result = reduce.reduceSpaces(text);

        assertEquals(expected,result);
    }
}
