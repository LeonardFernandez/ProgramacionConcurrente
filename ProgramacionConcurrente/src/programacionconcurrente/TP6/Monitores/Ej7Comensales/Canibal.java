/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP6.Monitores.Ej7Comensales;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jk
 */
public class Canibal extends Thread{
    private int id;
    private Olla olla;
    
    public Canibal(int unId, Olla unaOlla){
        id=unId;
        olla=unaOlla;
    }
    
    public void run(){
        while(true){
            olla.comer(id);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Canibal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
