/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_duel;

/**
 *
 * @author prod
 */
public class SuperHeroi extends Personagem {
    public SuperHeroi(String nome, String nomeVidaReal){
        super(nome, nomeVidaReal);
    }
    public void printStats(){
        System.out.printf("Sua vida é: %d\n", this.getVida());
    }
    public void printPoderes(){
        SuperPoder[] poderes = this.getPoderes();
        System.out.println("Seus poderes são:");
        System.out.printf("1 = %s, de intensidade %d; 2 = %s de intensidade %d; 3 = %s, de intensidade %d;\n", 
                poderes[0].getNome(),
                poderes[0].getIntensidade(),
                poderes[1].getNome(),
                poderes[1].getIntensidade(),
                poderes[2].getNome(),
                poderes[2].getIntensidade()
        );
    
    }
    
}
