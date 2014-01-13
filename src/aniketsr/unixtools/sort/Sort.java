package aniketsr.unixtools.sort;

import aniketsr.FileSystem.MyFile;

public class Sort {
    SortOperations sort;

    public Sort(String text) {
        this.sort = new SortOperations(text);
    }

    public SortOperations getSort() {
        return sort;
    }

    public static void main(String[] args) {
        try {
            String text = new MyFile().readFile(args[0]);
            SortOperations sort = new Sort(text).getSort();
            String sortedLines;
            if (args.length > 1 && (args[1]).equals("-r"))
                sortedLines = sort.reverseSort();
            else
            sortedLines = sort.sortLines();
            System.out.println(sortedLines);
        } catch (Exception e){
            System.out.println("Something went wrong " + e);
        }

    }
}