package aniketsr.unixtools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class WordCount {
    public static void main(String[] fileNames) {
        WCOperations operation = new WCOperations();
        File file = null;
        String fileData = null;
        try {
            file = new File(fileNames[0]);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                fileData +="\r\n" + sCurrentLine;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong\n" + e);
        }

        int lines,words,chars;
        lines = operation.countLines(fileData);
        words = operation.countWords(fileData);
        chars = operation.countChars(fileData);

        System.out.println(lines + "\t" + words + "\t" + chars + " " + file.getName());
    }
}