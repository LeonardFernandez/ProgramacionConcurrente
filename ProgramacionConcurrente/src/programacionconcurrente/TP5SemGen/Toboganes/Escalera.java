/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP5SemGen.Toboganes;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonard.fernandez
 */
public class Escalera {
    private Semaphore semLugares;
    private Semaphore semAviso;
    
    public Escalera(int escalones){
        semLugares = new Semaphore(escalones);
        semAviso = new Semaphore(0);
    }
    
    public void subirEscalera(){
        //Visitante tambien libera lugar
        try {
            semLugares.acquire();
            
            Thread.sleep(200);
            semAviso.release();
        } catch (InterruptedException ex) {Logger.getLogger(Escalera.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    public void accesoAtraccion(){
        try {
            //Metodo utilizado por encargado
            semAviso.acquire();
            semLugares.release();
        } catch (InterruptedException ex) {Logger.getLogger(Escalera.class.getName()).log(Level.SEVERE, null, ex);}
    }
}
