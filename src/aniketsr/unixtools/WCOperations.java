package aniketsr.unixtools;

class WCOperations{
    int countLines(String text){
        String[] res = text.split("\n");
        return res.length - 1;
    }

    int countWords(String text){
        String[] res = text.split(" ");
        return res.length + countLines(text);
    }

    int countChars(String text){
        String[] res = text.split("");
        return res.length;
    }
}	