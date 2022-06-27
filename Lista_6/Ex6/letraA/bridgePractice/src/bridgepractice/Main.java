/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridgepractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ryan.souza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> vetor1 = new ArrayList<>();
        List<Integer> vetor2 = new ArrayList<>();
        vetor1.add(1);
        vetor1.add(2);
        vetor1.add(3);
        vetor1.add(4);
        vetor1.add(5);
        vetor2.add(4);
        vetor2.add(5);
        vetor2.add(6);
        vetor2.add(7);
        vetor2.add(8);
        MeusVetores meusVetores = new MeusVetores(vetor1, vetor2);
        System.out.println("---Uniao---");
        meusVetores.operaAlgumaCoisaAoMeuRespeito(new ConjuntosOperacaoUniao()).forEach(System.out::println);
        System.out.println("---Interseccao---");
        meusVetores.operaAlgumaCoisaAoMeuRespeito(new ConjuntosOperacaoInterseccao()).forEach(System.out::println);
        System.out.println("---Diferenca---");
        meusVetores.operaAlgumaCoisaAoMeuRespeito(new ConjuntosOperacaoDiferenca()).forEach(System.out::println);
    }
    
}
