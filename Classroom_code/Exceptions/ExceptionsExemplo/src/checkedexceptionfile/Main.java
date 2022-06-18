/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkedexceptionfile;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args){
        LeitorDeArquivo meuLeitor = new LeitorDeArquivo();
        meuLeitor.LeArquivoComSensura();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        try {
            meuLeitor.LeArquivo();
        } catch (NomeFeioException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("PROGRAMA TERMINADO CORRETAMENTE.");
    }
}
