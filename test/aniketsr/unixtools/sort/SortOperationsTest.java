package aniketsr.unixtools.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortOperationsTest {
    @Test
    public void testSortLines() throws Exception {
        String text = "hi, hw r u?\ni am xyz\nall fine";
        String expected = "all fine\nhi, hw r u?\ni am xyz";
        SortOperations sort = new SortOperations(text);

        String result = sort.sortLines();

        assertEquals(expected,result);
    }
}
