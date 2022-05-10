/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtosinformatica;

/**
 *
 * @author ryrden
 */
public class Mouse extends Produto {
    protected String tipo;

    public Mouse(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    
    @Override
    public String getDescricao(){
        return this.descricao + " " +  this.tipo;
    }
}
