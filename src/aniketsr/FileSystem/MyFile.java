package aniketsr.FileSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {
    public String readFile(String filename) {
        String line;
        String resLine = "";
        try {
            BufferedReader br;
            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                line = line.concat("\n");
                resLine = resLine.concat(line);
            }
            return resLine;
        } catch (IOException e) {
            System.out.println("something went wrong" + e);
            return "";
        }

    }
}