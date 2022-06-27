/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypractice;

import java.util.List;

/**
 *
 * @author ryan.souza
 */
public class MeusVetores {
    private final List<Integer> vector1;
    private final List<Integer> vector2;

    public MeusVetores(List<Integer> vector1, List<Integer> vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public List<Integer> getVector1() {
        return vector1;
    }

    public List<Integer> getVector2() {
        return vector2;
    }

    public List<Integer> operaAlgumaCoisaAoMeuRespeito(ConjuntosOperacao conjuntosOperacao){
        return conjuntosOperacao.operacaoDeConjuntos(this);
    }
}
