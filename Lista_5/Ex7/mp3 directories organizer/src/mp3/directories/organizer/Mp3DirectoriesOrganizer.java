/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mp3.directories.organizer;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author ryan.souza
 */
public class Mp3DirectoriesOrganizer{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String directoryPath = "../";
        
        FilenameFilter mp3Filter = FileHandler.fileFilter(".mp3");
        
        File currentDirectory = new File(directoryPath);
        File[] currentPathFiles = currentDirectory.listFiles(mp3Filter);
        
        FileHandler.sortBySize(currentPathFiles);
            
        FileHandler.removeCaractersAndOrderMp3Files(currentPathFiles, directoryPath);
    }
}
