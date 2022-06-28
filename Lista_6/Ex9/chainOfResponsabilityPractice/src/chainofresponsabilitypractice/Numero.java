/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsabilitypractice;

/**
 *
 * @author ryan.souza
 */
public abstract class Numero {
    private Numero proximoNumero;
    
    public Numero pegaProximo() {
        return proximoNumero;
    }

    public void defineProximo(Numero numero) {
        this.proximoNumero = numero;
    }
    
    public void quadrado(int numero){
        System.out.println("Quadrado: " + Math.pow(numero,2));
    }
    
    public void raiz(int numero){
        System.out.println("Raiz: " + Math.sqrt(numero));
    }
    
    abstract void processaNumero(int numero);
    abstract boolean podeProcessar(int numero);
    
    public void processa(int numero){
        if (this.podeProcessar(numero)) 
            this.processaNumero(numero);
        else if (pegaProximo() != null) 
            pegaProximo().processa(numero);
        else 
            System.out.println("Erro de máquina");
        
    }
    
}
