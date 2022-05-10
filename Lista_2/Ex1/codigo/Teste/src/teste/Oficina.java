/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.ArrayList;
/**
 *
 * @author ryrden
 */
public class Oficina {
    private final ArrayList<Veiculo> veiculos = new ArrayList<>();
    private int indexVeiculoAtual = -1;
    
    public Oficina(){
        Veiculo v1 = new Bicicleta();
        Veiculo v2 = new Automovel();
        
        veiculos.add(v1);
        veiculos.add(v2);
        
    }
    
    public int getSize(){
        return veiculos.size();
    }
    
    public Veiculo proximo(){
        if(indexVeiculoAtual < veiculos.size())
            this.indexVeiculoAtual++;
        
        return veiculos.get(indexVeiculoAtual);
    }
    
    public boolean manutencao(Veiculo v){
        v.listarVerificacoes();
        v.ajustar();
        v.limpar();
        
        if (v instanceof Automovel){
            ((Automovel)v).trocarOleo();
        }

        return true;
    }
}
