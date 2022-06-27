/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypractice;

/**
 *
 * @author ryan.souza
 */
public class factoryOperacaoConjuntos {
    public static void printUniao(MeusVetores vetores){
        System.out.println("---Uniao---");
        vetores.operaAlgumaCoisaAoMeuRespeito(new ConjuntosOperacaoUniao()).forEach(System.out::println);
    }
    public static void printInterseccao(MeusVetores vetores){
        System.out.println("---Interseccao---");
        vetores.operaAlgumaCoisaAoMeuRespeito(new ConjuntosOperacaoInterseccao()).forEach(System.out::println);
    }
    public static void printDiferenca(MeusVetores vetores){
        System.out.println("---Diferenca---");
        vetores.operaAlgumaCoisaAoMeuRespeito(new ConjuntosOperacaoDiferenca()).forEach(System.out::println);
    }

    
}
