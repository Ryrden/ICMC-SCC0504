package bridgepractice;

import java.util.ArrayList;
import java.util.List;

public class ConjuntosOperacaoInterseccao implements ConjuntosOperacao {

    @Override
    public List<Integer> operacaoDeConjuntos(MeusVetores vetores) {
        List<Integer> intersection = new ArrayList<>();
        for(Integer i : vetores.getVector1()){
            if(vetores.getVector2().contains(i)){
                intersection.add(i);
            }
        }
        return intersection;
    }
}
