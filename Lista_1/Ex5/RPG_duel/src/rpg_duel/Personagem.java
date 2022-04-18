/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_duel;

/**
 *
 * @author prod
 */
public class Personagem {
    private String nome;
    private String nomeVidaReal;
    private SuperPoder[] poderes;
    private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void atacar(int intensidade, Personagem alvo){
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }
    
    public double getTotalPoder(){
        return this.poderes.length;
    }
}
