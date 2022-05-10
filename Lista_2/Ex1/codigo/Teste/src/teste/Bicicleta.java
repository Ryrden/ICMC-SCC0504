/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author ryrden
 */
public class Bicicleta extends Veiculo{

    @Override
    public void listarVerificacoes() {
        System.out.println("Listando verificacoes da Bicicleta");
    }

    @Override
    public boolean ajustar() {
        System.out.println("Ajustando Bicicleta");
        return true;
    }

    @Override
    public boolean limpar() {
        System.out.println("Limpando Bicicleta");
        return true;
    }
    
}
