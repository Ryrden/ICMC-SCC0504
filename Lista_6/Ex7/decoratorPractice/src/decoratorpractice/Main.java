/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratorpractice;

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
        Divida divida = new Divida(100);
        Juros jurosComDesconto = new Desconto(new JurosSimples(5, 6),10);
        Juros jurosComDescontoEComAcrescimo = new Desconto(new AcrescimoDeTaxa(
                new JurosSimples(5,6),10),5);
        
        System.out.println(jurosComDesconto.calcula(divida));
        System.out.println(jurosComDescontoEComAcrescimo.calcula(divida));

    }
    
}
