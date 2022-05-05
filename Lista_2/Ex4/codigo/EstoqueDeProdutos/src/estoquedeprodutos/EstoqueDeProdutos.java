/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estoquedeprodutos;
import java.time.LocalDate;
/**
 *
 * @author ryrden
 */
public class EstoqueDeProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        
        Produto prod1 = new Produto(0,5.40f,10,"Aveia");
        Produto prod2 = new ProdutoPerecivel(1,9.80f, 4, "Iogurte", dataAtual);
        Produto prod3 = new ProdutoPerecivelEspecial(2,7.45f, 7, "Cereal", dataAtual);
        Produto prod4 = new ProdutoNaoPerecivel(3, 15.00f, 3, "Cubuca", 2);
        Estoque Estoque = new Estoque();
        
        Estoque.cadastrarItem(prod1);
        Estoque.cadastrarItem(prod2);
        Estoque.cadastrarItem(prod3);
        Estoque.cadastrarItem(prod4);
        
        Produto prod = Estoque.consultarProduto(2);
        prod.obterProduto();
        System.out.println("Custo Total de: "+Estoque.obterCustoTotalEstoque());
        Estoque.obterDescricaoProdutos();
        
    }
    
}
