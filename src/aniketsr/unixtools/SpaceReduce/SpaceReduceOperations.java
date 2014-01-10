package aniketsr.unixtools.SpaceReduce;

public class SpaceReduceOperations {
        String reduceSpaces(String fileData){
            return fileData.replaceAll("\\ +"," ");
        }
}