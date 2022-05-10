/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prod
 */
public class Escola extends Predio{
    private String[] diciplinas;
    private String nivelEducacional;

    public Escola(float CO2EmitidoNaConstrucao, float CH4EmitidoNaConstrucao, float N2OEmitidoNaConstrucao) {
        super(CO2EmitidoNaConstrucao, CH4EmitidoNaConstrucao, N2OEmitidoNaConstrucao);
    }
    

    public String[] getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(String[] diciplinas) {
        this.diciplinas = diciplinas;
    }

    public String getNivelEducacional() {
        return nivelEducacional;
    }

    public void setNivelEducacional(String nivelEducacional) {
        this.nivelEducacional = nivelEducacional;
    }
    
}
