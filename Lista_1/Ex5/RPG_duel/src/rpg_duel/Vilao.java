/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_duel;

/**
 *
 * @author prod
 */
public class Vilao extends Personagem {
    private int anosDePrisao;

    public Vilao(String nome, String nomeVidaReal, int class_){
        super(nome, nomeVidaReal, class_);
    }
    
    public int getAnosDePrisao() {
        return anosDePrisao;
    }

    public void setAnosDePrisao(int anosDePrisao) {
        this.anosDePrisao = anosDePrisao;
    }
    
}
