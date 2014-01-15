package aniketsr.unixtools.tail;

import aniketsr.FileSystem.MyFile;

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
        if (args.length<1){
            System.err.println("Atleast filename is needed");
            System.exit(1);
        }
        try {
            Tail cli = new Tail(args[0]);
            TailOperations head = cli.getTail();
            int count;
            if (args.length < 2)
                count = 10;
            else count = Math.abs(Integer.parseInt(args[1]));
            System.out.println("\t" + head.showTail(count) + "\t");
        } catch (Exception e) {
            System.out.println("Something went wrong :- " + e);
        }
    }
}
