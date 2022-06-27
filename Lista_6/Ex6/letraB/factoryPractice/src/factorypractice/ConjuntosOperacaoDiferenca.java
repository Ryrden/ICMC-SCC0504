/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ryan.souza
 */
public class ConjuntosOperacaoDiferenca implements ConjuntosOperacao {

    @Override
    public List<Integer> operacaoDeConjuntos(MeusVetores vetores) {
        List<Integer> difference = new ArrayList<>();
        for(Integer i : vetores.getVector1()){
            if(!vetores.getVector2().contains(i)){
                difference.add(i);
            }
        }
        return difference;
    }
    
}
