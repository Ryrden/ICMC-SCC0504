/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author prod
 */
public class Carro implements PegadaDeCarbono{
   private float CO2EmitidoNaConstrucao;
   private float CH4EmitidoNaConstrucao;
   private float N2OEmitidoNaConstrucao;
   private float kilometrosRodados;
   private float combustivelGastoPorKm;
   private boolean carroLigado;

    public Carro(float CO2EmitidoNaConstrucao, float CH4EmitidoNaConstrucao, float N2OEmitidoNaConstrucao, float kilometrosRodados, float combustivelGastoPorKm) {
        this.CO2EmitidoNaConstrucao = CO2EmitidoNaConstrucao;
        this.CH4EmitidoNaConstrucao = CH4EmitidoNaConstrucao;
        this.N2OEmitidoNaConstrucao = N2OEmitidoNaConstrucao;
        this.kilometrosRodados = kilometrosRodados;
        this.combustivelGastoPorKm = combustivelGastoPorKm;
        this.carroLigado = false;
    }

    public float getCO2EmitidoNaConstrucao() {
        return CO2EmitidoNaConstrucao;
    }

    public void setCO2EmitidoNaConstrucao(float CO2EmitidoNaConstrucao) {
        this.CO2EmitidoNaConstrucao = CO2EmitidoNaConstrucao;
    }

    public float getCH4EmitidoNaConstrucao() {
        return CH4EmitidoNaConstrucao;
    }

    public void setCH4EmitidoNaConstrucao(float CH4EmitidoNaConstrucao) {
        this.CH4EmitidoNaConstrucao = CH4EmitidoNaConstrucao;
    }

    public float getN2OEmitidoNaConstrucao() {
        return N2OEmitidoNaConstrucao;
    }

    public void setN2OEmitidoNaConstrucao(float N2OEmitidoNaConstrucao) {
        this.N2OEmitidoNaConstrucao = N2OEmitidoNaConstrucao;
    }

    public float getKilometrosRodados() {
        return kilometrosRodados;
    }

    public void setKilometrosRodados(float kilometrosRodados) {
        this.kilometrosRodados = kilometrosRodados;
    }

    public float getCombustivelGastoPorKm() {
        return combustivelGastoPorKm;
    }

    public void setCombustivelGastoPorKm(float combustivelGastoPorKm) {
        this.combustivelGastoPorKm = combustivelGastoPorKm;
    }

    public boolean isCarroLigado() {
        return carroLigado;
    }

    public void ligCarro() {
        this.carroLigado = !this.carroLigado;
    }
    
    @Override
    public float getPegadaDeCarbono() {
        float CO2 = this.CO2EmitidoNaConstrucao * GWPCO2;
        float CH4 = this.CH4EmitidoNaConstrucao * GWPCH4;
        float N2O = this.N2OEmitidoNaConstrucao * GWPN2O;
        float pegadaPerKM = this.kilometrosRodados * (float) 0.0051 * GWPCO2; // emição por km rodade de CO2
        
        return CO2 + CH4 + N2O + pegadaPerKM;
    }
}
