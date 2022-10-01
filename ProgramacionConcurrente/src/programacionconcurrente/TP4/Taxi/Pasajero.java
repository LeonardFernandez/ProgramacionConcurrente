/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP4.Taxi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jk
 */
public class Pasajero extends Thread{
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
