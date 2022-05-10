/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produtosinformatica;

import java.util.ArrayList;

/**
 *
 * @author ryrden
 */
public class ProdutosInformatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<>();
        
        Produto mouse1 = new Mouse("Mouse óptico, Saída USB,1.600 dpi");
        Produto mouse2 = new Mouse("Mouse óptico, Saída USB,1.200 dpi");
        
        ((Mouse) mouse1).setTipo("Mouse Gamer");
        ((Mouse) mouse2).setTipo("Mouse de Escritorio");
        
        Produto livro1 = new Livro("Ecce Homo");
        Produto livro2 = new Livro("Engenharia de Software");
        
        ((Livro) livro1).setAutor("Nietzche");
        ((Livro) livro2).setAutor("Pressman");
        
        carrinho.add(mouse1);
        carrinho.add(mouse2);
        carrinho.add(livro1);
        carrinho.add(livro2);
        
        for(int i = 0; i < carrinho.size(); i++){
            System.out.println(carrinho.get(i).getDescricao());
        }
        
    }
    
}
