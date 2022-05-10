/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

/**
 *
 * @author ryrden
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Oficina o = new Oficina();
        Veiculo v;
        for(int i = 0; i < o.getSize(); ++i){
            v = o.proximo();
            o.manutencao(v);
        }
    }
    
}
