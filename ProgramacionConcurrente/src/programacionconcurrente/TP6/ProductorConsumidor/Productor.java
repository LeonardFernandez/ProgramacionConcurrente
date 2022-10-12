/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP6.ProductorConsumidor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonard.fernandez
 */
public class Productor extends Thread{
    Productos col;
    int id;
    
    public Productor(Productos unaCol, int unId){
        col=unaCol;
        id=unId;
    }
    
    public void run(){
        try {
            col.generar(id);
        } catch (InterruptedException ex) {
            Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
