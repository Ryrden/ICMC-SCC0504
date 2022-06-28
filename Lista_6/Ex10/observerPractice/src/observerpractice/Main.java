/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpractice;

import java.util.Scanner;

/**
 *
 * @author ryan.souza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjetoObservavel oObservado1 = new ObjetoObservavel();
        ObjetoObservavel oObservado2 = new ObjetoObservavel();
        ObjetoObservavel oObservado3 = new ObjetoObservavel();
        
        ObserverMaiusculo osMaisculo = new ObserverMaiusculo();
        ObserverConcatenaAno osAno = new ObserverConcatenaAno();
        ObserverConcatenaTamanho osTam = new ObserverConcatenaTamanho();

        oObservado1.addObserver(osMaisculo);
        oObservado2.addObserver(osAno);
        oObservado3.addObserver(osTam);

        Scanner scan = new Scanner (System.in);
        while(true){
            System.out.println("Entre com uma string, se quiser sair digite 'sair'");
            String string = scan.nextLine();
            if (string.equals("sair"))
                break;
            oObservado1.setString(string);
            oObservado2.setString(string);
            oObservado3.setString(string);
            
            oObservado1.notifyObservers(oObservado1);
            oObservado2.notifyObservers(oObservado2);
            oObservado3.notifyObservers(oObservado3);
        }
    }
    
}
