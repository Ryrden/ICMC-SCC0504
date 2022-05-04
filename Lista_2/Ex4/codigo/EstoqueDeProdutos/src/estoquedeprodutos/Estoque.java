/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoquedeprodutos;

import java.util.ArrayList;

/**
 *
 * @author ryrden
 */
public class Estoque {
    protected ArrayList<Produto> produtos;
    
    public boolean cadastrarItem(Produto item){
        if (item == null)
            return false;
        
        produtos.add(item);
        
        return true;
    }
    
    public Produto consultarProduto(int codigo){
        for(int i = 0; i < produtos.size(); i++){
            Produto produto = produtos.get(i);
            if (produto.getCodigo() == codigo)
                return produto;
        }
        return null;
    }
    
    public boolean retirarProduto(int codigo){
        for(int i = 0; i < produtos.size(); i++){
            Produto produto = produtos.get(i);
            if (produto.getCodigo() == codigo){
                produtos.remove(produto);
                return true;
            }
        }
        return false;
    }
    
    public float obterCustoTotalEstoque(){
        float custoTotal = 0;
        for(int i = 0; i < produtos.size();i++){
            Produto produto = produtos.get(i);
            float preco = produto.getPrecoUnitario();
            int quantidade = produto.getQntEstoque();
            custoTotal += (preco * quantidade);
        }
        return custoTotal;
    }
    
    public void obterDescricaoProdutos(){
        for(int i = 0; i < produtos.size(); i++){
            Produto produto = produtos.get(i);
            produto.obterProduto();
        }
    }
}
