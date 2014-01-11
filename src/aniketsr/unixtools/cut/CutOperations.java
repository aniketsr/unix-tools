package aniketsr.unixtools.cut;

public class CutOperations {
    public String getSpecificFeild(int column ,String text, String delimiter) {
        String[] lines = text.split("\n");
        String[] fields;
        String field = "";

        for (int i = 0; i < lines.length; i++) {
            fields = lines[i].split(delimiter);
            if(fields.length >= column) {
                field += fields[column-1]+"\n";
            }
            else {
                field +="\n";
            }
        }
        return field.substring(0 , field.length()-1);
    }
}

