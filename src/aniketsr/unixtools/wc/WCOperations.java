package aniketsr.unixtools.wc;

public class WCOperations{
    String text;

    public WCOperations(String text) {
        this.text = text;
    }

    public int countLines(){
        return text.split("\\n+").length - 1;
    }

    public int countWords(){
        return text.split("\\w+").length - 1;
    }

    public int countChars(){
        return text.length();
    }
}	