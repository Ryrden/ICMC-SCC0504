/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpg_duel;
import java.util.Scanner;
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
        System.out.println("1 = Mago; 2 = Berzerker; 3 = Ladino;");
        int class_ = sc.nextInt();
        
        
        
        SuperHeroi hero = new SuperHeroi(characterName, realName, class_);
        
        




    }
    
}
