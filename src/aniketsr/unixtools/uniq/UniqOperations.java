package aniketsr.unixtools.uniq;

public class UniqOperations {
    String text;

    public UniqOperations(String text) {
        this.text = text;
    }

    public String giveUniqLines() {
        String[] lines = text.split("\n");
        String result = "";
        for (int i = 0; i < lines.length - 1; i++) {
            if (!lines[i].equals(lines[i + 1]))
                result += lines[i] + "\n";
        }
        if (!lines[lines.length - 1].equals(lines[lines.length - 2]))
            result += lines[lines.length - 1];
        return result;
    }
}
