/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgepractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ryan.souza
 */
public class ConjuntosOperacaoUniao implements ConjuntosOperacao{

    @Override
    public List<Integer> operacaoDeConjuntos(MeusVetores vetores) {
        List<Integer> union = new ArrayList<>();
        for (Integer i : vetores.getVector1()) {
            union.add(i);
        }
        for (Integer i : vetores.getVector2()) {
            if (!union.contains(i)) {
                union.add(i);
            }
        }
        return union;
    }
    
}
