/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author ryrden
 */
public class Automovel extends Veiculo {

    @Override
    public void listarVerificacoes() {
        System.out.println("Listando verificacoes da Automovel");
    }

    @Override
    public boolean ajustar() {
        System.out.println("Ajustando Automovel");
        return true;
    }

    @Override
    public boolean limpar() {
        System.out.println("Limpando Automovel");
        return true;
    }
    
    public boolean trocarOleo(){
        System.out.println("Trocando oleo do Automovel");
        return true;
    }
    
}
