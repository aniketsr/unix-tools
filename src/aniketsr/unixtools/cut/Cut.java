package aniketsr.unixtools.cut;
import aniketsr.FileSystem.MyFile;

public class Cut {
    public static void main(String args[]) {
        if (args.length<2){
            System.err.println("Filename and field number is necessary");
            System.exit(1);
        }
        try {
            MyFile file = new MyFile();
            CutOperations cut = new CutOperations();
            String result="";
            String separator = " ";
            int column = 0 ;

            for (int i = 0; i < args.length; i++) {
                if(args[i].startsWith("-d")){
                    separator = args[i].substring(2);
                }
                else if(args[i].startsWith("-f")) {
                    column = Integer.parseInt(args[i].substring(2));
                }
                else if(args[i].endsWith(".txt")) {
                    result = file.readFile(args[i]);
                }
                else{
                    result = args[i];
                }
            }
            System.out.println(cut.getSpecificFeild(column, result, separator));
        }catch (Exception e){
            System.out.println("Something went wrong " + e);
        }

    }
}