/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpractice;

import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author ryan.souza
 */
public class ObserverConcatenaAno implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        ObjetoObservavel temp = (ObjetoObservavel)o;
        String string = temp.getString();
        Calendar cal = Calendar.getInstance();
        String year = String.valueOf(cal.get(Calendar.YEAR));
        string += year;
        System.out.println("------------------------------------------");
        System.out.println("Observador Ano, novo valor: " + string);
        System.out.println("------------------------------------------");
    }
    
}
