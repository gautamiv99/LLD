package designpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    public String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        this.fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Inside directory " + directoryName);
        for(FileSystem fileSystem: fileSystemList){
            fileSystem.ls();
        }
    }
}
