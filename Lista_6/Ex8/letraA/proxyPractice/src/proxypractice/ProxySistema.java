/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypractice;

/**
 *
 * @author ryan.souza
 */
public class ProxySistema {
    Sistema sistema;

    public ProxySistema() {
        this.sistema = new Sistema();
    }

    public void executa(String comando) {
        if (comando.equals("789"))
            throw new Error("ERRO: tentativa de execucao de codigo malicioso");
        sistema.executa(comando);

    }

    public void executa2(String comando) {
        if (comando.equals("789"))
            throw new Error("ERRO: tentativa de execucao de codigo malicioso");
        sistema.executa(comando);
    }
}
