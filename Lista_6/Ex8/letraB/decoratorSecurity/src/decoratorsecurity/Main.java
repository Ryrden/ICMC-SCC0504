/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratorsecurity;

/**
 *
 * @author ryan.souza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Sem decorator*/
        System.out.println("---Sem Decorator---");
        Sistema sistema1 = new SistemaImplementacao();
        sistema1.executa("123");
        sistema1.executa("789");
        sistema1.executa2("123");
        sistema1.executa2("789");
        /*Com decorator*/
        System.out.println("---Com Decorator---");
        Sistema sistema2 = new FilteredSistema(new SistemaImplementacao());
        sistema2.executa("123");
        sistema2.executa("789");
        sistema2.executa2("123");
        sistema2.executa2("789");
    }
    
}
