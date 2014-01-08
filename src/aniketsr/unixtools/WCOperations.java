package aniketsr.unixtools;

class WCOperations{
    int countLines(String text){
        String[] res = text.split("\n");
        return res.length;
    }

    int countWords(String text){
        String[] res = text.split(" ");
        return res.length;
    }

    int countChars(String text){
        String[] res = text.split("");
        return res.length;
    }
}	