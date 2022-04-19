/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpg_duel;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
/**
 *
 * @author prod
 */
public class RPG_duel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira seu nome:");
        String realName = sc.nextLine();
        
        System.out.println("Insira o nome de seu personagem:");
        String characterName = sc.nextLine();
        
        System.out.println("Insira a classe do personagem:");
        System.out.println("1 = Mago; 2 = Berzerker;");
        int class_ = sc.nextInt();
        
        SuperHeroi hero = new SuperHeroi(characterName, realName);
        iniciaPoderes(hero, class_);
        
        Vilao enemy = new Vilao("Vader", "Ankin", 15);
        iniciaPoderes(enemy, 2);
        
        lore(hero, enemy);
   
        System.out.println("\n\nPor motivos de não temos tempo para desenvolver uma plotline");
        System.out.println("Você encontra-se diante de sua batalha final, o que irá fazer ?");
        
        while(hero.getVida() > 0 || enemy.getVida() > 0){
            hero.printStats();
            hero.printPoderes();
            System.out.println("Selecione um poder para usar!");
  
            int poder = sc.nextInt();
            SuperPoder poderUsado = hero.getPoderes()[poder -1];
  
            if(poder == 3){
                hero.alteraVida(poderUsado.getIntensidade());
                System.out.println("você se curou");
            }
            else{
                int result = hero.atacar(poderUsado.getIntensidade(), enemy);
                
                if (result == 1){
                    System.out.println("você acertou e causou dano");
                }
                else{
                    System.out.println("você errou");
                }
            }
            
            Random rn = new Random();
            poder = (rn.nextInt() % 3 );
            
            if (poder <= -1){
                poder = 1;
            }
            
            poderUsado = hero.getPoderes()[poder];
            
            if(poder == 3){
                enemy.alteraVida(poderUsado.getIntensidade());
            }
            else{
                int result = enemy.atacar(poderUsado.getIntensidade(), hero);
                if (result == 1){
                    System.out.println("você levou um ataque e sofreu dano");
                }
                else{
                    System.out.println("O inimigo errou");
                }
            }
            System.out.println("\n\n");
        }
        
        if(enemy.getVida() <= 0){
            System.out.println("Parabens você venceu e salvou a galaxia");
        }
        else{
            System.out.println("Infelizmente você perdeu, e toda a glaxia foi destruida");
        }
       
    }
    public static void lore(SuperHeroi hero, Vilao enemy){
        System.out.println("A muito tempo, numa galaxia muito, muito distante");
        System.out.println("Havia um jovem guerreiro que se corrompeu");
        System.out.printf("Após %d anos na prisão, %s, agora conhecido como %s escapou\n",
                enemy.getAnosDePrisao(),
                enemy.getNomeVidaReal(),
                enemy.getNome()
        );
        System.out.println("Agora é seu dever como heroi dessa terra encontra-lo e dete-lo");
        System.out.printf("Que a força esteja com você %s\n", hero.getNome());
    }
    
    public static void iniciaPoderes(Personagem personagem, int class_){
        SuperPoder[] poderes = new SuperPoder[3];
        switch(class_){
            case 1:
                poderes[0] = new SuperPoder(1, "Misseis magicos", -10);
                poderes[1] = new SuperPoder(1, "Raio magico", -20);
                poderes[2] = new SuperPoder(3, "Recuperar vida", 10);
                break;
            case 2:
                poderes[0] = new SuperPoder(2,"Golpe de machado", -10 );
                poderes[1] = new SuperPoder(2,"Furia berzeker", -20);
                poderes[2] = new SuperPoder(3, "Recuperar vida", 10);
                break;
        }
        personagem.setPoderes(poderes);
    }
    
}
