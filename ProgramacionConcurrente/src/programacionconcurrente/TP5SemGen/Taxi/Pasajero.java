/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP5SemGen.Taxi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonard.fernandez
 */
public class Pasajero {
     Taxi taxi;
    int idPasajero;
    
    public Pasajero(Taxi unTaxi, int unId){
        taxi=unTaxi;
        idPasajero=unId;
    }
    
    public void run(){
        try {
            taxi.subirse();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El pasajero "+ idPasajero + " se sube al taxi");
        try {
            taxi.bajarse();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El pasjero " + idPasajero + " se baja del taxi");
    }
}
