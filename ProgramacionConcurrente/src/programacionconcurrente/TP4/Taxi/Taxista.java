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
public class Taxista extends Thread {

    Taxi taxi;

    public Taxista(Taxi unTaxi) {
        taxi = unTaxi;
    }

    public void run() {
        for (int i = 0; i < 5; i++) { //Supongamos que el taxista piensa hacer 5 viajes por jornada
            try {
                taxi.viajar();
            } catch (InterruptedException ex) {
                Logger.getLogger(Taxista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
