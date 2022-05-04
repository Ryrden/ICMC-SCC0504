/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoquedeprodutos;

import java.util.Date;

/**
 *
 * @author ryrden
 */
public class ProdutoPerecivelEspecial extends ProdutoPerecivel {
    public ProdutoPerecivelEspecial(int codigo, float precoUnitario, int qntEstoque, String descricao, Date dataValidade){
        super();
    }
    
    
    public void imprimirNotaDeControle(){
         System.out.println("Produto "+this.codigo+", "+this.descricao
                    +", quantidade "+this.qntEstoque
                    +", data de validade "+this.dataValidade);
    }
}
