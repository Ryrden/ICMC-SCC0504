/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_duel;

/**
 *
 * @author prod
 */
public class SuperPoder {
   private int categoria;
   private String nome;
   private int intensidade;
   private int chanceDeAcerto;
   
   public SuperPoder(int categoria, String nome, int intensidade){
       this.categoria = categoria;
       this.nome = nome;
       this.intensidade = intensidade;
       this.chanceDeAcerto = 50;
   }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public int getChanceDeAcerto() {
        return chanceDeAcerto;
    }

    public void setChanceDeAcerto(int chanceDeAcerto) {
        this.chanceDeAcerto = chanceDeAcerto;
    }
   

   public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
