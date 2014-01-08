package aniketsr.unixtools.wc;

public class WCOperations{
    String text;

    public WCOperations(String text) {
        this.text = text;
    }

    public int countLines(){
        String[] res = text.split("\n");
        return res.length - 1;
    }

    public int countWords(){
        String[] res = text.split(" ");
        return res.length + countLines();
    }

    public int countChars(){
        String[] res = text.split("");
        return res.length;
    }
}	