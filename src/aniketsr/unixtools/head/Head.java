package aniketsr.unixtools.head;

import aniketsr.FileSystem.MyFile;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;

public class Head {
    HeadOperations head;

    public Head(String fileName) {
        MyFile file = new MyFile();
        String text = file.readFile(fileName);
        this.head = new HeadOperations(text);
    }

    public HeadOperations getHead() {
        return head;
    }

    public static void main(String[] args) {
        try {
            Head cli = new Head(args[0]);
            HeadOperations head = cli.getHead();
            File file = new File(args[0]);
            int count;
            if (args.length < 2)
                count = 10;
            else count = Integer.parseInt(args[1]);
            System.out.println("\t" + head.showHeader(count) + "\t" + file.getName());
        }catch (Exception e){
            System.out.println("Something went wrong :- " + e);
        }

    }
}
