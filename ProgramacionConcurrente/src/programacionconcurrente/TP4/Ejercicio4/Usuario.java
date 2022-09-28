/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP4.Ejercicio4;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonard.fernandez
 */
public class Usuario extends Thread {
    int nombre;
    Impresora imp;
    
    public Usuario(int name, Impresora unaImpresora){
        nombre=name;
        imp=unaImpresora;
    }
    
    public void realizarImpresion(int numHoja) throws InterruptedException{
        imp.imprimir(nombre, numHoja);
    }
    
    public void run(){
        for(int j=0; j<10; j++){
            try {
                realizarImpresion(j);
            } catch (InterruptedException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
