/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pegada.de.carbono.pkg3.pkg1;

/**
 *
 * @author prod
 */
public interface PegadaDeCarbono {
    public static final int GWPCO2 = 1;
    public static final int GWPCH4 = 28;
    public static final int GWPN2O = 265;
    
    public float getPegadaDeCarbono(float CO2, float CH4, float N2O);
}
