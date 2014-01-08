package aniketsr.unixtools.head;

public class HeadOperations {
    String text;

    public HeadOperations(String text) {
        this.text = text;
    }

    public String showHeadLines(){
        return text;
    }
}
