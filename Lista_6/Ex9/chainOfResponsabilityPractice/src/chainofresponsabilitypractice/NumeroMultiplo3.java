/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsabilitypractice;

/**
 *
 * @author ryan.souza
 */
public class NumeroMultiplo3 extends Numero{
    
    public NumeroMultiplo3(Numero numero) {
        this.defineProximo(numero);
    }
    
    @Override
    public void processaNumero(int numero) {
        System.out.println("Numero processado por NumeroMultiplo3");
        this.quadrado(numero);
        this.raiz(numero);
    }

    @Override
    boolean podeProcessar(int numero) {
        if (numero % 3 == 0)
            return true;
        return false;
    }
    
}
