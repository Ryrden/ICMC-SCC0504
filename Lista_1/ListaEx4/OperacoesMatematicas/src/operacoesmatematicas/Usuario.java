/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoesmatematicas;

/**
 *
 * @author prod
 */
public class Usuario {
    private String name;
    private String cpf;
    private int idade;
       
    public Usuario(String name, String cpf, int idade){
        this.name = name;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void printUsuario(){
        System.out.printf("Usuario: \n"
                + "Nome: %s\n"
                + "CPF: %s\n"
                + "Idade: %d\n", this.name, this.cpf, this.idade);
    }
    
    
    
}
