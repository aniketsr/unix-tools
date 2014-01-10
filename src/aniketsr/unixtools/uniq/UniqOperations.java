package aniketsr.unixtools.uniq;

import java.util.ArrayList;

public class UniqOperations {
    String text;

    public UniqOperations(String text) {
        this.text = text;
    }

    public String giveUniqLines() {
        String[] lines = text.split("\n");
        String result = "";
        for (int i = 0; i <lines.length-1 ; i++) {
            if (!lines[i].equals(lines[i+1]))
                result += lines[i] + "\t";
        }
        return result;
    }
}
