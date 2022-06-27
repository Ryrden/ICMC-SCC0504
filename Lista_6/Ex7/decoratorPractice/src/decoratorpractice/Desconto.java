/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpractice;

/**
 *
 * @author ryan.souza
 */
public class Desconto extends JurosDecorator {
    private final float desconto;
    public Desconto(Juros juros, float composicaoDePorcentagem) {
        super(juros, composicaoDePorcentagem);
        this.desconto = composicaoDePorcentagem;
    }

    public float calcula(Divida divida) {
        return juro.calcula(divida) - (divida.getCapital() * (desconto/100));
    }
    
}
