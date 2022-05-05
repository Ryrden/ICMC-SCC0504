/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoquedeprodutos;

import java.time.LocalDate; 

/**
 *
 * @author ryrden
 */
public class ProdutoPerecivelEspecial extends ProdutoPerecivel {
    public ProdutoPerecivelEspecial(int codigo, float precoUnitario, int qntEstoque, String descricao, LocalDate dataValidade){
        super(codigo, precoUnitario, qntEstoque, descricao, dataValidade);
    }
    
    public void imprimirNotaDeControle(){
         System.out.println("Produto "+this.codigo+", "+this.descricao
                    +", quantidade "+this.qntEstoque
                    +", data de validade "+this.dataValidade);
    }
}
