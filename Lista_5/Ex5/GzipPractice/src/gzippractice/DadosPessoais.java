/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gzippractice;

import java.io.Serializable;

/**
 *
 * @author ryan.souza
 */
public class DadosPessoais implements Serializable{
    private Endereco endereco;
    private String nome;
    private int idade;

    public DadosPessoais(Endereco endereco, String nome, int idade) {
        this.endereco = endereco;
        this.nome = nome;
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco.getEnderecoCompleto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
