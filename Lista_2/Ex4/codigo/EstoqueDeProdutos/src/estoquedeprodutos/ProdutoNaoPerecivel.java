/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoquedeprodutos;

/**
 *
 * @author ryrden
 */
public class ProdutoNaoPerecivel extends Produto{
    protected int anosDeGarantia;
    public ProdutoNaoPerecivel(int codigo, float precoUnitario, int qntEstoque, String descricao, int anosDeGarantia){
        super(codigo, precoUnitario, qntEstoque, descricao);
        this.anosDeGarantia = anosDeGarantia;
    }
    public int getAnosDeGarantia() {
        return anosDeGarantia;
    }
    
    
}
