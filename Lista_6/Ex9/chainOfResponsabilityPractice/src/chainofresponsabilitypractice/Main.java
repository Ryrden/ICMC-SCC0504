/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chainofresponsabilitypractice;

/**
 *
 * @author ryan.souza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numero numeroTratamento = new NumeroMultiplo2(
                new NumeroMultiplo3(new NumeroDemaisNumeros(null)));
        
        System.out.println("--numero 5--");
        numeroTratamento.processa(5);
        System.out.println("--numero 16--");
        numeroTratamento.processa(16);
        System.out.println("--numero 9--");
        numeroTratamento.processa(9);
        System.out.println("--numero 6--");
        numeroTratamento.processa(6);
    }
    
}
