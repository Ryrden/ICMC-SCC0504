/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorsecurity;

/**
 *
 * @author ryan.souza
 */
public abstract class SistemaDecorator extends Sistema {
    Sistema sistema;

    public SistemaDecorator(Sistema sistema) {
        this.sistema = sistema;
    }
}
