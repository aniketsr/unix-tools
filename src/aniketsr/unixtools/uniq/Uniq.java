package aniketsr.unixtools.uniq;

import aniketsr.FileSystem.MyFile;

import java.io.File;

public class Uniq {
    UniqOperations uniq;

    public Uniq(String fileName) {
        MyFile file = new MyFile();
        String text = file.readFile(fileName);
        this.uniq = new UniqOperations(text);
    }

    public UniqOperations getTail() {
        return uniq;
    }

    public static void main(String[] args) {
        try {
            Uniq cli = new Uniq(args[0]);
            UniqOperations uniq = cli.getTail();
            File file = new File(args[0]);
            System.out.println("\t"+uniq.giveUniqLines()+"\t"+file.getName());
        } catch (Exception e) {
            System.out.println("Something went wrong :- " + e);
        }
    }
}
