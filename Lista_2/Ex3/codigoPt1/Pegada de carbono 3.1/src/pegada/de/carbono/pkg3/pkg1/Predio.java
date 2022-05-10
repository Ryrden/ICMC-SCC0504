/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegada.de.carbono.pkg3.pkg1;

/**
 *
 * @author prod
 */
public class Predio implements PegadaDeCarbono{
   private float CO2EmitidoNaConstrucao;
   private float CH4EmitidoNaConstrucao;
   private float N2OEmitidoNaConstrucao;
   private int   andares;
   private String[] materiaisUsados;
   private boolean horarioDeFuncionamento; 

    public Predio(float CO2EmitidoNaConstrucao, float CH4EmitidoNaConstrucao, float N2OEmitidoNaConstrucao, int andares, String[] materiaisUsados) {
        this.CO2EmitidoNaConstrucao = CO2EmitidoNaConstrucao;
        this.CH4EmitidoNaConstrucao = CH4EmitidoNaConstrucao;
        this.N2OEmitidoNaConstrucao = N2OEmitidoNaConstrucao;
        this.andares = andares;
        this.materiaisUsados = materiaisUsados;
        this.horarioDeFuncionamento = false;
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

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public String[] getMateriaisUsados() {
        return materiaisUsados;
    }

    public void setMateriaisUsados(String[] materiaisUsados) {
        this.materiaisUsados = materiaisUsados;
    }

    public boolean entrarEmHorarioDeFuncionmento(){
        this.horarioDeFuncionamento = !this.horarioDeFuncionamento;
        return this.horarioDeFuncionamento;
    }
    
    @Override
    public float getPegadaDeCarbono() {
        float CO2=this.CO2EmitidoNaConstrucao   * GWPCO2;
        float CH4 = this.CH4EmitidoNaConstrucao * GWPCH4;
        float N2O = this.N2OEmitidoNaConstrucao * GWPN2O;
        return CO2 + CH4 + N2O;
    }
}
