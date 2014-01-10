package aniketsr.unixtools.SpaceReduce;

import aniketsr.FileSystem.MyFile;

public class SpaceReducer {
    public static void main(String[] args) {
        String fileName = args[0];
        SpaceReduceOperations r = new SpaceReduceOperations();
        MyFile fo = new MyFile();
        String fileData = fo.readFile(fileName);
        fileData = r.reduceSpaces(fileData);
        fo.writeFile(fileName,fileData);
    }
}