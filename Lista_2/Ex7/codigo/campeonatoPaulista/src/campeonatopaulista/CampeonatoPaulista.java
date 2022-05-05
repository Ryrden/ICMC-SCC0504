/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campeonatopaulista;

/**
 *
 * @author ryrden
 */
public class CampeonatoPaulista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeFutebol time1 = new TimeFutebol(5, 6, 2, 7, 6, 2, 1);
        TimeFutebol time2 = new TimeFutebol(5, 6, 2, 7, 6, 2, 1);
        
        TimeFutebol timeVencedor = time1.desempataTime(time2);
        
        if (timeVencedor == time1)
            System.out.println("Time1 venceu");
        else if (timeVencedor == time2)
            System.out.println("Time2 venceu");
    }
    
}
