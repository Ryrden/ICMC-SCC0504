
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author prod
 */
public class PegadaDeCarbonopt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // TODO code application logic here
        ArrayList<PegadaDeCarbono> carbs = new ArrayList<>();
        Bicicleta b1 = new Bicicleta(1, 1, 1, 500);
        Bicicleta b2 = new Bicicleta(7, 1, 1, 6000);
        Carro c1 = new Carro(30, 20, 20, 2500, 10);
        Carro c2 = new Carro(30, 20, 20, 40000, 10);
        Casa casa1 = new Casa(300, 150, 120);
        Casa casa2 = new Casa(430, 200, 140);
        Escola e1 = new Escola(543, 241, 65);
        Escola e2 = new Escola(1236, 300, 120);
        
        carbs.add(b1);
        carbs.add(b2);
        carbs.add(c1);
        carbs.add(c2);
        carbs.add(casa1);
        carbs.add(casa2);
        carbs.add(e1);
        carbs.add(e2);
        
        float pegadaDeCarbonoTotal = 0;
        
        for(PegadaDeCarbono pegada : carbs){
            pegadaDeCarbonoTotal += pegada.getPegadaDeCarbono();
        }
        
        System.out.println(pegadaDeCarbonoTotal);
    
    }
    
}
