/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtosinformatica;

/**
 *
 * @author ryrden
 */
public class Livro extends Produto{
    protected String autor;

    public Livro(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String getDescricao(){
        return this.descricao + " " + this.autor;
    }
    
}
