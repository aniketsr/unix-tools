package aniketsr.unixtools.head;

import aniketsr.FileSystem.MyFile;

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
        Head cli = new Head(args[0]);
        HeadOperations head = cli.getHead();
        File file = new File(args[0]);
        System.out.println("\t" + head.showHeadLines() + "\t" + file.getName());
    }
}
