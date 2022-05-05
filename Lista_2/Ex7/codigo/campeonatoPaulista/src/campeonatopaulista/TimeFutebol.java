/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campeonatopaulista;

import java.util.Random;

/**
 *
 * @author ryrden
 */
public class TimeFutebol implements Comparable{
    private final int numVitorias;
    private final int numDerrotas;
    private final int numEmpates;
    private final int numGolsMarcados;
    private final int numGolsSofridos;
    private final int numCartoesAmarelos;
    private final int numCartoesVermelhos;
    
    public TimeFutebol(int numVitorias, 
            int numDerrotas, 
            int numEmpates, 
            int numGolsMarcados, 
            int numGolsSofridos, 
            int numCartoesAmarelos, 
            int numCartoesVermelhos) {
        this.numVitorias = numVitorias;
        this.numDerrotas = numDerrotas;
        this.numEmpates = numEmpates;
        this.numGolsMarcados = numGolsMarcados;
        this.numGolsSofridos = numGolsSofridos;
        this.numCartoesAmarelos = numCartoesAmarelos;
        this.numCartoesVermelhos = numCartoesVermelhos;
    }
    
    @Override
    public TimeFutebol desempataTime(TimeFutebol time) {
        int pontosTime1 = this.obterPontosTime();
        int pontosTime2 = time.obterPontosTime();
        if (pontosTime1 != pontosTime2)
            return pontosTime1 > pontosTime2 ? this : time;
        else if (this.getNumVitorias() != time.getNumVitorias())
            return this.getNumVitorias() > time.getNumVitorias() ? this : time;
        else if (this.getNumGolsMarcados() != time.getNumGolsMarcados())
            return this.getNumGolsMarcados() > time.getNumGolsMarcados() ? this : time;
        else if (this.getNumCartoesVermelhos() != time.getNumCartoesVermelhos())
            return this.getNumCartoesVermelhos() < time.getNumCartoesVermelhos() ? this : time;
        else if (this.getNumCartoesAmarelos() != time.getNumCartoesAmarelos())
            return this.getNumCartoesAmarelos() < time.getNumCartoesAmarelos() ? this : time;
        
        Random rand = new Random();
        return rand.nextBoolean() ? this : time;
        
    }
    
    public int obterPontosTime(){
        return this.numGolsMarcados*3 + this.numEmpates*1;
    }
    
    public int getNumVitorias() {
        return numVitorias;
    }

    public int getNumDerrotas() {
        return numDerrotas;
    }

    public int getNumEmpates() {
        return numEmpates;
    }

    public int getNumGolsMarcados() {
        return numGolsMarcados;
    }

    public int getNumGolsSofridos() {
        return numGolsSofridos;
    }

    public int getNumCartoesAmarelos() {
        return numCartoesAmarelos;
    }

    public int getNumCartoesVermelhos() {
        return numCartoesVermelhos;
    }   

}
