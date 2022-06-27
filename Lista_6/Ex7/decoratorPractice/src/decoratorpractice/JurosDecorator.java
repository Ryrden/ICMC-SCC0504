/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpractice;

/**
 *
 * @author ryan.souza
 */
public abstract class JurosDecorator extends Juros{
    Juros juro;
    
    protected JurosDecorator(Juros juro, float composicaoDePorcentagem){ 
        this.juro = juro;
    }
}
