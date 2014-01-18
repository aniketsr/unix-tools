package aniketsr.unixtools.tail;

public class TailOperations {
    String text;

    public TailOperations(String text) {
        this.text = text;
    }

    public String showTail(int count) {
        String result = "";
        String[] content = text.split("\n");
        if (count > content.length){
            count = content.length;
        }
        try {
            for (int i = content.length - count; i <= content.length; i++) {
                result = result.concat(content[i].concat("\n"));
            }
        } catch (Exception e) {
        }
        return result.substring(0, result.length()-1);
    }
}
