package aniketsr.unixtools.tail;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

public class TailOperations {
    String text;
    public TailOperations(String text) {
        this.text = text;
    }

    public String showTail(int count) {
        String result = "";
        String[] content = text.split("\n");
        try {
            for (int i = count; i <= content.length; i++) {
                result = result.concat(content[i].concat("\n"));
            }
        } catch (Exception e){}

        return result.substring(0,result.length()-1);
    }
}
