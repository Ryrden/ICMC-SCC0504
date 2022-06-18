/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorreadline;

/**
 *
 * @author ryan.souza
 */
public abstract class LineDecorator extends LineReader {
    LineReader line;

    LineDecorator(LineReader line) {
        this.line = line;
    }
    
    
}
