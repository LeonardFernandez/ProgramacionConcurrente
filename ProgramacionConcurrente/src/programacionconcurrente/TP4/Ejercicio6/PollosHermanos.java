/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP4.Ejercicio6;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jk
 */
public class PollosHermanos {
    Semaphore semSillaLibre;
    Semaphore semAvisarMozo;
    Semaphore semComidaServida;

    public PollosHermanos() {
        this.semSillaLibre = new Semaphore(1);
        this.semAvisarMozo = new Semaphore(0);
        this.semComidaServida = new Semaphore(0);
    }
    
    public void pedirComida(int num){
        try {
            semSillaLibre.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(PollosHermanos.class.getName()).log(Level.SEVERE, null, ex);
        }
        semAvisarMozo.release();
    }
    
    public void tomarPedido(){
        try {
            semAvisarMozo.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(PollosHermanos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Thread.sleep(3000);//Prepara la comida
        } catch (InterruptedException ex) {
            Logger.getLogger(PollosHermanos.class.getName()).log(Level.SEVERE, null, ex);
        }  
        semComidaServida.release();
//        System.out.println("El mozo sirve la comida");
    }
    
    public void comer(int num){
        try {
            
            semComidaServida.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(PollosHermanos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Thread.sleep(3000);//El empleado come
        } catch (InterruptedException ex) {
            Logger.getLogger(PollosHermanos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void terminarComer(int num){
        
        semSillaLibre.release();
    }
}
