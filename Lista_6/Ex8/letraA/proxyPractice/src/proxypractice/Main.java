/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxypractice;

/**
 *
 * @author ryan.souza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Sem proxy*/
        System.out.println("---Sem proxy---");
        Sistema sistema = new Sistema();
        sistema.executa("123");
        sistema.executa2("789");
        /*Com proxy*/
        System.out.println("---Com proxy---");
        ProxySistema proxy = new ProxySistema();
        proxy.executa("123");
        proxy.executa2("123");
        proxy.executa("789");
    }
    
}
