package aniketsr.unixtools.sort;

import java.util.Arrays;
import java.util.Collections;

public class SortOperations {
    String text;

    public String join(String[] lines, String delimeter) {
        StringBuilder build = new StringBuilder("");
        for (String line : lines) {
            build.append(line).append(delimeter);
        }
        return build.substring(0, text.length());
    }

    public SortOperations(String text) {
        this.text = text;
    }

    public String sortLines() {
        String[] lines = text.split("\n");
        Collections.sort(Arrays.asList(lines));
        return join(lines,"\n");
    }

    public String reverseSort() {
        String[] sortedLines = sortLines().split("\n");
        Collections.reverse(Arrays.asList(sortedLines));
        return join(sortedLines,"\n");
    }
}