/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratorreadline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ryan.souza
 */
public class DecoratorReadLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here// TODO code application logic here
            File file = new File("../arquivo.txt");
            RandomAccessFile reader = new RandomAccessFile(file, "r");
            LineReader line = new NumberLine( new MeuLineNumberReader(reader));
            while(reader.getFilePointer() < reader.length()){
                System.out.println(line.readLine());
            }
        } catch (IOException ex) {
            System.out.println("Error! " + ex);
        }
    }
    
}
