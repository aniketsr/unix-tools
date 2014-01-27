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
        int defaultLines;
        try {
            MyFile file = new MyFile();
            String config = file.readFile(System.getenv("UNIX_HOME") + "/bin/MyConfig.txt");
            defaultLines = Integer.parseInt(config.split(":")[1].trim());
        } catch (Exception e) {
            defaultLines = 10;
        }
        try {
            Tail cli = new Tail(args[0]);
            TailOperations tail = cli.getTail();
            int count;
            if (args.length < 2)
                count = defaultLines;
            else count = Math.abs(Integer.parseInt(args[1]));
            System.out.println("\t" + tail.showTail(count) + "\t");
        } catch (Exception e) {
            System.out.println("Something went wrong :- " + e);
        }
    }
}
