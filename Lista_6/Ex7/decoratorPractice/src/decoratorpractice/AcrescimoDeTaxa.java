/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpractice;

/**
 *
 * @author ryan.souza
 */
public class AcrescimoDeTaxa extends JurosDecorator {
    private float acrescimo;
    public AcrescimoDeTaxa(Juros juros, float composicaoDePorcentagem) {
        super(juros, composicaoDePorcentagem);
        this.acrescimo = composicaoDePorcentagem;
    }

    @Override
    public float calcula(Divida divida) {
        return juro.calcula(divida) + acrescimo;
    }
}
