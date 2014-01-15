package aniketsr.unixtools.uniq;

import aniketsr.FileSystem.MyFile;

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
        if(args.length<1){
            System.err.println("Atleast filename is needed");
            System.exit(1);
        }
        try {
            Uniq cli = new Uniq(args[0]);
            UniqOperations uniq = cli.getTail();
            System.out.println("\t"+uniq.giveUniqLines());
        } catch (Exception e) {
            System.out.println("Something went wrong :- " + e);
        }
    }
}
