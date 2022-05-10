/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sojava;

import java.util.ArrayList;

/**
 *
 * @author prod
 */
public class SistemaOperacional {
    private ArrayList<Driver> drivers;
    private float memoriaDisponivel;
    private float memoriaUsada;

    public SistemaOperacional(){
        this.memoriaDisponivel = 1000;
        this.memoriaUsada = 0;    
        
        this.drivers = new ArrayList<>();
        
        Video vd = new Video();
        this.drivers.add(vd);
        
        Audio au = new Audio();
        this.drivers.add(au);
        
        Impressao im = new Impressao();
        this.drivers.add(im);
        
        Teclado te = new Teclado();
        this.drivers.add(te);
        
        WebCam wc = new WebCam();
        this.drivers.add(wc);
        
        AdptadorDeRede ad = new AdptadorDeRede();
        this.drivers.add(ad);
    }

    public float getMemoriaDisponivel() {
        return memoriaDisponivel;
    }

    public void setMemoriaDisponivel(float memoriaDisponivel) {
        this.memoriaDisponivel = memoriaDisponivel;
    }

    public float getMemoriaUsada() {
        return memoriaUsada;
    }

    public void setMemoriaUsada(float memoriaUsada) {
        this.memoriaUsada = memoriaUsada;
    }    
    
    public void calibrarTodos(){
        for(Driver dr : drivers){
            dr.calibrar();
        }
    }
}
