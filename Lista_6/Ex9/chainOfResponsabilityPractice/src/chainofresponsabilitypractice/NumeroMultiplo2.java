/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsabilitypractice;

/**
 *
 * @author ryan.souza
 */
public class NumeroMultiplo2 extends Numero {
    
    public NumeroMultiplo2(Numero numero) {
        this.defineProximo(numero);
    }
    
    @Override
    public void processaNumero(int numero) {
        System.out.println("Numero processado por NumeroMultiplo2");
        this.quadrado(numero);
        this.raiz(numero);
    }

    @Override
    boolean podeProcessar(int numero) {
        if (numero % 2 == 0)
            return true;
        return false;
    }

}
