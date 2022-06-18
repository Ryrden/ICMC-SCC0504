/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorreadline;

import decoratorreadline.LineDecorator;
import decoratorreadline.LineReader;

/**
 *
 * @author ryan.souza
 */
public class NumberLine extends LineDecorator{
    private int numberLine = 0;
    NumberLine(LineReader line) {
        super(line);
    }
    
    @Override
    public String readLine() {
        numberLine++;
        return numberLine + ": " + line.readLine();
    }
    
}
