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
public class Tobogan {
    private Semaphore semTobogan;
    private Semaphore semPermiso;
    
    public Tobogan(){
        semTobogan = new Semaphore(1);
        semPermiso = new Semaphore(0);
    }
    
    public void bajarTobogan(int visitante){
        try {
            semPermiso.acquire();
            semTobogan.acquire();
            System.out.println("El visitante "+visitante+" esta bajando el tobogan");
            Thread.sleep(2000);
            System.out.println("El visitante "+visitante+" termino de bajar el tobogan");
            semTobogan.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Tobogan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void habilitarTobogan(){
        semPermiso.release();
    }
}
