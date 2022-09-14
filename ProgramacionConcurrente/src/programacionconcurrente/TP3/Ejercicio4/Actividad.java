/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP3.Ejercicio4;

/**
 *
 * @author leonard.fernandez
 */
public class Actividad {

    private String nombre;
    private boolean enUso;

    public Actividad(String n) {
        nombre = n;
        enUso = false;
    }

    public synchronized boolean usar() throws InterruptedException {
        boolean uso=false;
        if(!enUso){
            enUso = true;
            uso=true;
        }
        return uso;
    }

    public synchronized void dejarDeUsar() {
        enUso = false;
    }

    public String getNombre() {
        return nombre;
    }
    
    public synchronized boolean getEnUso(){
        return enUso;
    }
}
