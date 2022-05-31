/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exibediretorios;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ryan.souza
 */
public class soFiles {
    public static void scanFiles(String directoryPath){
        File currentDirectory = new File(directoryPath);
        File[] currentPathFiles = currentDirectory.listFiles();
        for(File file : currentPathFiles){
            try{
                if (new File(file.getCanonicalPath()).isDirectory())
                    scanFiles(file.getCanonicalPath());
                else 
                    System.out.println(file.getName());
            }catch(IOException e){
                System.out.println("Error!"+ e);
            }
        }
    }
}
