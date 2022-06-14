/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package substituistring;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author ryan.souza
 */
public class SubstituiString {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String arq = "../datafile.txt";
        try{
            File data = new File(arq);
            RandomAccessFile file = new RandomAccessFile(arq,"rw");
            file.seek(0); //volta ao início
            file.writeUTF("Precisamos de muito pouco para sermos muito felizes");
            file.writeUTF("Voce ta com muito frio!");
            file.writeUTF("eu gosto muito da minha familia");
            
            readFile(file);
            replacesStringInFile(file);
            System.out.println("--------------");
            readFile(file);
            
            file.close();
  
        } catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
    public static void readFile(RandomAccessFile file) throws IOException{
        file.seek(0);
        while(file.getFilePointer() < file.length()){
            System.out.println(file.readUTF());
        }
    }
    public static void replacesStringInFile(RandomAccessFile file) throws IOException {
        file.seek(0);
        long offset = file.getFilePointer();
        while (offset < file.length()){
            String line = file.readUTF();
            line = line.replace("muito", "pouco");
            file.seek(offset);
            file.writeUTF(line);
            offset = file.getFilePointer();
        }
    }
}

