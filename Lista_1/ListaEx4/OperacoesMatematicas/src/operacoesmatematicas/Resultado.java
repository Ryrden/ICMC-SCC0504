/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoesmatematicas;
import java.time.*;  
/**
 *
 * @author prod
 */
public class Resultado {
    private Usuario usuario;
    private int tipo;
    private final int[] data;
    private float resultado;
    
    public Resultado(){
        // formato [DD, MM, AA]
        // inicializa data com o dia atual
        data = new int[3];
        LocalDate ld = LocalDate.now();
        this.data[0] = ld.getDayOfMonth();
        this.data[1] = ld.getMonthValue();
        this.data[2] = ld.getYear();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int[] getData() {
        return data;
    }
    
    public void setData(int data[]) {
        // formato [DD, MM, AA] 
        // altera a data para um novo valor
        this.data[0] = data[0];
        this.data[1] = data[1];
        this.data[2] = data[2];
    }

    public void printData(){
        System.out.printf("%d/%d/%d\n", this.data[0], this.data[1], this.data[2]);
    }
    
    public float getResultado() {
        return resultado;
    }
    
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }  
}
