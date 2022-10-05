/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP5SemGen.Taxi;

/**
 *
 * @author leonard.fernandez
 */
public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Pasajero[] colPasajeros = new Pasajero[6];
        Taxista taxista = new Taxista(taxi);
        for (int j = 0; j < 6; j++) {
            colPasajeros[j] = new Pasajero(taxi, j + 1);
        }
        for(int i=0; i<6; i++){
            colPasajeros[i].start();
        }
        taxista.start();
    }
}
