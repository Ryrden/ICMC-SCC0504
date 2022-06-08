/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gzippractice;

import java.io.Serializable;

/**
 *
 * @author ryan.souza
 */
public class Endereco implements Serializable{
    private String CEP;
    private String logradouro;
    
    public Endereco(String CEP, String logradouro) {
        this.CEP = CEP;
        this.logradouro = logradouro;
    }
    
    public String getEnderecoCompleto(){
        return this.logradouro + this.CEP;
    }
       
    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    
}
