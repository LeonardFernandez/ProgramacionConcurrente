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
public class Taxista {
    Taxi taxi;

    public Taxista(Taxi unTaxi) {
        taxi = unTaxi;
    }

    public void run() {
        for (int i = 0; i < 5; i++) { //Supongamos que el taxista piensa hacer 5 viajes por jornada
            try {
                taxi.comenzarViaje();
            } catch (InterruptedException ex) {
                Logger.getLogger(programacionconcurrente.TP4.Taxi.Taxista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
