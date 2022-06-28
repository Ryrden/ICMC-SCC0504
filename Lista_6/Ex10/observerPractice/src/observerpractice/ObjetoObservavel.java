/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpractice;

import java.util.Observable;

/**
 *
 * @author ryan.souza
 */
public class ObjetoObservavel extends Observable {
    private String string;

    @Override
    public String toString(){
        return string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
        this.setChanged();
    }
    
    
}
