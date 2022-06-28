/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpractice;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author ryan.souza
 */
public class ObserverConcatenaTamanho implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        ObjetoObservavel temp = (ObjetoObservavel)o;
        String string = temp.getString();
        String tamanhoString = String.valueOf(string.length());
        string = tamanhoString + string;
        System.out.println("------------------------------------------");
        System.out.println("Observador Tamanho, novo valor: " + string);
        System.out.println("------------------------------------------");
    }
    
}
