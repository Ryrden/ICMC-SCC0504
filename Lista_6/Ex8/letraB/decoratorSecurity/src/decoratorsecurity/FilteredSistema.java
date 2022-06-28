/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorsecurity;

/**
 *
 * @author ryan.souza
 */
public class FilteredSistema extends SistemaDecorator{

    public FilteredSistema(Sistema sistema) {
        super(sistema);
    }
    
    @Override
    void executa(String comando) {
        if (comando.equals("789")){
            System.out.println("tentativa de execucao de codigo malicioso, "
                    + "convertendo o comando para o comando neutro 987");
            sistema.executa("987");
        }else {
            sistema.executa(comando);
        }
    }

    @Override
    void executa2(String comando) {
        if (comando.equals("789")){
            System.out.println("tentativa de execucao de codigo malicioso, "
                    + "convertendo o comando para o comando neutro 987");
            sistema.executa2("987");
        }else {
            sistema.executa2(comando);
        }
    }
    
}
