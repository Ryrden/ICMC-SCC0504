/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gzippractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author ryan.souza
 */
public class GzipPractice implements Serializable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            File data = new File("../datafile.txt");
            data.createNewFile();
            FileOutputStream dataOutput = new FileOutputStream(data);
            GZIPOutputStream compacter = new GZIPOutputStream(dataOutput);
            ObjectOutputStream serializer = new ObjectOutputStream(compacter);
            
            Endereco endereco = new Endereco("13566590","Av. Trab Sao Carlense,400");
            DadosPessoais pessoaEscrita = new DadosPessoais(endereco, "Ryan S",20);
            
            serializer.writeObject(pessoaEscrita);
            serializer.flush();
            serializer.close();
            
            FileInputStream dataInput = new FileInputStream(data);
            GZIPInputStream descompacter = new GZIPInputStream(dataInput);
            ObjectInputStream deserializer = new ObjectInputStream(descompacter);
            
            DadosPessoais pessoaLeitura = (DadosPessoais) deserializer.readObject();
            deserializer.close();
            
            System.out.println(pessoaLeitura.getNome());
            System.out.println(pessoaLeitura.getIdade());
            System.out.println(pessoaLeitura.getEndereco());
        }catch(IOException e){
            System.out.println("Error: " + e);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(GzipPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
