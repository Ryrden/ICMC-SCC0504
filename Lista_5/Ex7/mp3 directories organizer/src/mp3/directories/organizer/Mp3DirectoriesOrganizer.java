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
        
        FilenameFilter exeFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                String lowercaseName = name.toLowerCase();
                return lowercaseName.endsWith(".mp3");

            }
        };
        File currentDirectory = new File(directoryPath);
        File[] currentPathFiles = currentDirectory.listFiles(exeFilter);
        sortBySize(currentPathFiles);
        Counter count = new Counter();
        count.countUp();
        for(File file : currentPathFiles){
            String name = file.getName();
            String orderCounter = count.getCount();
            if (name.startsWith(orderCounter))
                orderCounter += ".";
            name = name.replace(".mp3","");
            name = name.replaceAll("[0-9]", "");
            name = name.replace("-","");
            file.renameTo(new File(directoryPath + orderCounter + name + ".mp3"));
            count.countUp();
        }
    }
    private static void sortBySize(File[] files){
     Arrays.sort(files, new Comparator<File>() {
        @Override
        public int compare(File t, File t1) {
            return (int) (t.length() - t1.length());
        }
    });
}
}
