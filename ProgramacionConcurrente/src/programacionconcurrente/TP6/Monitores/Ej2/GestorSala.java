/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP6.Monitores.Ej2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jk
 */
public class GestorSala {
    private int cantPersonas;
    private int cantJubilados;
    private int tUmbral;
    private int tempActual;
    public GestorSala(int temp){
        cantPersonas=0;
        tUmbral=35;
        tempActual=temp;
    }
    
    public synchronized void entrarSala(String visitante){
        while((tempActual>=tUmbral && cantPersonas>=35) || (cantPersonas>=50) || cantJubilados>=0){
            try {
                
                this.wait();
                
            } catch (InterruptedException ex) { Logger.getLogger(GestorSala.class.getName()).log(Level.SEVERE, null, ex);}
        }
        System.out.println("El visitante "+visitante+" entro a la sala");
        cantPersonas++;
    }
    
    public synchronized void entrarSalaJubilado(String visitante){
        while(cantPersonas>=50){
            try {
                
                cantJubilados++;
                this.wait();
                
            } catch (InterruptedException ex) { Logger.getLogger(GestorSala.class.getName()).log(Level.SEVERE, null, ex);}
        }
        System.out.println("El jubilado "+visitante+" entro a la sala");
        cantPersonas++;
        cantJubilados--;
    }
    
    public synchronized void salirSala(String visitante){
        System.out.println("El visitante "+visitante+" salio de la sala");
        cantPersonas--;
        notifyAll();
    }
    
    public synchronized void notificarTemperatura(){
        
    }
}
