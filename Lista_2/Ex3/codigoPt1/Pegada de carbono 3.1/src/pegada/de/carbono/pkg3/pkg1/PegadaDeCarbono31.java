/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pegada.de.carbono.pkg3.pkg1;

import java.util.ArrayList;

/**
 *
 * @author prod
 */
public class PegadaDeCarbono31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PegadaDeCarbono> carbs = new ArrayList<>();
        Bicicleta b1 = new Bicicleta(1, 1, 1, 500);
        Bicicleta b2 = new Bicicleta(7, 1, 1, 6000);
        Carro c1 = new Carro(30, 20, 20, 2500, 10);
        Carro c2 = new Carro(30, 20, 20, 40000, 10);
        Predio p1 = new Predio(300, 150, 120, 10, args);
        Predio p2 = new Predio(550, 250, 120, 10, args);
        
        carbs.add(b1);
        carbs.add(b2);
        carbs.add(c1);
        carbs.add(c2);
        carbs.add(p1);
        carbs.add(p2);
        
        float pegadaDeCarbonoTotal = 0;
        
        for(PegadaDeCarbono pegada : carbs){
            pegadaDeCarbonoTotal += pegada.getPegadaDeCarbono();
        }
        
        System.out.println(pegadaDeCarbonoTotal);
        
    
    }
    
}
