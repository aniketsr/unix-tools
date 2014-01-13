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
        return build.toString();
    }

    public SortOperations(String text) {
        this.text = text;
    }

    public String[] sortLines() {
        String[] lines = text.split("\n");
        Collections.sort(Arrays.asList(lines));
        return lines;
    }
}