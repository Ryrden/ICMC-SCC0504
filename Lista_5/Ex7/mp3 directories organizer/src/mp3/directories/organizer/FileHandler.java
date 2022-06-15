/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mp3.directories.organizer;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author ryan.souza
 */
public class FileHandler {
    public static FilenameFilter fileFilter(String fileType){
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                String lowercaseName = name.toLowerCase();
                return lowercaseName.endsWith(fileType);

            }
        };
        return filter;
    }
    
    public static void sortBySize(File[] files){
        Arrays.sort(files, new Comparator<File>() {
           @Override
           public int compare(File t, File t1) {
               return (int) (t.length() - t1.length());
           }
       });
    }
    
    public static void removeCaractersAndOrderMp3Files(File[] files, String directoryPath){
        Counter count = new Counter();
        count.countUp();
        for(File file : files){
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
}