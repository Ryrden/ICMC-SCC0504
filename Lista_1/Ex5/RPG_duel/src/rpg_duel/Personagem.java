/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_duel;
import java.util.Random;
/**
 *
 * @author prod
 */
public class Personagem {
    private String nome;
    private String nomeVidaReal;
    private SuperPoder[] poderes;
    private int vida;

    public Personagem(String nome, String nomeVidaReal){
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
        this.vida = 100;
    }

    public SuperPoder[] getPoderes() {
        return poderes;
    }

    public void setPoderes(SuperPoder[] poderes) {
        this.poderes = poderes;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void alteraVida(int dano){
        this.vida += dano;
    }
    
    public int atacar(int intensidade, Personagem alvo){
        // retorna 1 se deu certo e 0 se falhou
        Random rn = new Random();
        int chance = (rn.nextInt()%100) +1;
        
        if(Math.abs(chance) > 50){
            alvo.alteraVida(intensidade);
            return 1;
        }
        else{
            return 0;
        }
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
