/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonard.fernandez
 */
public class Hilo extends Thread{
    public Hilo (){
        
    }
    
    public void run(){
        Thread miHilo = new MiEjecucion();
        miHilo.start();
        try {
            miHilo.join(); //Este hilo no se 
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TesteoHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
