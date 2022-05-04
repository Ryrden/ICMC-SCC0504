/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoquedeprodutos;

/**
 *
 * @author ryrden
 */
public class Produto {
    protected int codigo;
    protected float precoUnitario;
    protected int qntEstoque;
    protected String descricao;
   
    public Produto(int codigo, float precoUnitario, int qntEstoque, String descricao){
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.qntEstoque = qntEstoque;
        this.descricao = descricao;
    }
    
    public int retirarEstoque(int qnt){
        if (qnt > this.qntEstoque)
            qnt = this.qntEstoque;
        this.qntEstoque -= qnt;
        
        return qnt;    
    }
    
    public int acrescentarEstoque(int qnt){
        this.qntEstoque += qnt;
        return qnt;
    }
    
    public void obterProduto(){
        System.out.println("Produto "+this.codigo+", "+this.descricao
                +", custo de R$ "+this.precoUnitario
                +", quantidade "+this.qntEstoque);
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }
}
