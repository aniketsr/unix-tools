package aniketsr.FileSystem;

import java.io.*;

public class MyFile {
    public String readFile(String filename) {
        String line;
        String resLine = "";
        try {
            BufferedReader br;
            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                line = line.concat("\r\n");
                resLine = resLine.concat(line);
            }
            return resLine;
        } catch (IOException e) {
            System.out.println("something went wrong" + e);
            return "";
        }

    }

    public void writeFile(String fileName,String content){
        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            String[] temp = content.split("\n");
            for(String line : temp)
                writer.println(line);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}