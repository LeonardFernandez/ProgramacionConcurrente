/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP6.Monitores.Ej7Comensales;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jk
 */
public class Olla {

    Lock cerrojo = new ReentrantLock();
    Condition hayComida = cerrojo.newCondition();
    Condition cocinar = cerrojo.newCondition();
    private int raciones;

    public Olla(int cant) {
        raciones = cant;
    }

    public void comer(int canibal) {
        cerrojo.lock();
        try {
            while (raciones <= 0) {
                cocinar.signal();
                hayComida.await();
            }
            System.out.println("El canibal n°"+canibal+" consumio la racion "+raciones);
            raciones--;
        } catch (InterruptedException ex) {Logger.getLogger(Olla.class.getName()).log(Level.SEVERE, null, ex);}
        finally{cerrojo.unlock();}
    }
    
    public void cocinar(){
        cerrojo.lock();
        try {
            while(raciones>=1){
                cocinar.await();
            }
            System.out.println("El cocinero cocino 10 raciones");
            raciones=10;
            hayComida.signal();
        } catch (InterruptedException ex) {Logger.getLogger(Olla.class.getName()).log(Level.SEVERE, null, ex);}
        finally{cerrojo.unlock();}
    }
}
