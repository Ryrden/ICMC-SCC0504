/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prod
 */
public class Casa extends Predio{
    private int moradores;
    private String endereco;

    public Casa(float CO2EmitidoNaConstrucao, float CH4EmitidoNaConstrucao, float N2OEmitidoNaConstrucao) {
        super(CO2EmitidoNaConstrucao, CH4EmitidoNaConstrucao, N2OEmitidoNaConstrucao);
    }
    

    public int getMoradores() {
        return moradores;
    }

    public void setMoradores(int moradores) {
        this.moradores = moradores;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
