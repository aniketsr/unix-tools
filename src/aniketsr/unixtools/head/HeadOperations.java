package aniketsr.unixtools.head;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

public class HeadOperations {
    String text;
    public HeadOperations(String text) {
        this.text = text;
    }

    public String showHeader(int count) {
        System.out.println(count);
        String result = "";
        String[] content = text.split("\n");
        try {
            for (int i = 0; i < count; i++) {
                result = result.concat(content[i].concat("\n"));
            }
        } catch (Exception e){}

        return result.substring(0,result.length()-1);
    }
}
