package aniketsr.unixtools.head;

import aniketsr.FileSystem.MyFile;

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
        int defaultLines;
        try {
            MyFile file = new MyFile();

            String config = file.readFile(System.getenv("UNIX_HOME") + "/bin/MyConfig.txt");
            defaultLines = Integer.parseInt(config.split(":")[1].trim());
        } catch (Exception e) {
            defaultLines = 10;
        }

        if (args.length < 1) {
            System.err.println("Atleast filename is needed");
            System.exit(1);
        }
        try {
            Head cli = new Head(args[0]);
            HeadOperations head = cli.getHead();
            int count;
            if (args.length < 2)
                count = defaultLines;
            else count = Math.abs(Integer.parseInt(args[1]));
            System.out.println("\t" + head.showHeader(count));
        } catch (Exception e) {
            System.out.println("Something went wrong :- " + e);
        }
    }
}
