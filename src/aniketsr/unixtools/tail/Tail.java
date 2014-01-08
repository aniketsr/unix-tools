package aniketsr.unixtools.tail;

import aniketsr.FileSystem.MyFile;

import java.io.File;

public class Tail {
    TailOperations tail;

    public Tail(String fileName) {
        MyFile file = new MyFile();
        String text = file.readFile(fileName);
        this.tail = new TailOperations(text);
    }

    public TailOperations getTail() {
        return tail;
    }

    public static void main(String[] args) {
        try {
            Tail cli = new Tail(args[0]);
            TailOperations head = cli.getTail();
            File file = new File(args[0]);
            int count;
            if (args.length < 2)
                count = 10;
            else count = Integer.parseInt(args[1]);
            System.out.println("\t" + head.showTail(count) + "\t" + file.getName());
        }catch (Exception e){
            System.out.println("Something went wrong :- " + e);
        }
    }
}
