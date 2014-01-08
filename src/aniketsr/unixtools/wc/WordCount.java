package aniketsr.unixtools.wc;

import aniketsr.FileSystem.MyFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class WordCount {
    WCOperations wc;

    public WordCount(String fileName) {
        MyFile file = new MyFile();
        String text = file.readFile(fileName);
        this.wc = new WCOperations(text);
    }

    public WCOperations getWc() {
        return wc;
    }

    public static void main(String[] args) {
        WordCount cli = new WordCount(args[0]);
        WCOperations wc = cli.getWc();
        File file = new File(args[0]);
        System.out.println("\t" + wc.countLines() + "\t" + wc.countWords() + "\t" + wc.countChars() + "\t" + file.getName());
    }
}