package aniketsr.unixtools.SpaceReduce;

import aniketsr.FileSystem.MyFile;

public class SpaceReducer {
    public static void main(String[] args) {
        try {
            String fileName = args[0];
            SpaceReduceOperations r = new SpaceReduceOperations();
            MyFile file = new MyFile();
            String fileData = file.readFile(fileName);
            fileData = r.reduceSpaces(fileData);
            file.writeFile(fileName, fileData);
        } catch (Exception e){
            System.out.println("Something went wrong " + e);
        }

    }
}