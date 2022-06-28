/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsabilitypractice;

/**
 *
 * @author ryan.souza
 */
public class NumeroDemaisNumeros extends Numero{

    public NumeroDemaisNumeros(Numero numero) {
        this.defineProximo(numero);
    }
    
    
    
    @Override
    public void processaNumero(int numero) {
        System.out.println("Numero processado por NumeroDemaisNumeros");
        this.quadrado(numero);
        this.raiz(numero);
    }

    @Override
    boolean podeProcessar(int numero) {
        if (numero % 2 != 0 && numero % 3 != 0)
            return true;
        return false;
    }
    
}
