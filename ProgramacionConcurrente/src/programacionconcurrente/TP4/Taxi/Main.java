/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP4.Taxi;

/**
 *
 * @author jk
 */
public class Main {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Pasajero[] colPasajeros = new Pasajero[5];
        Taxista taxista = new Taxista(taxi);
        for (int j = 0; j < 5; j++) {
            colPasajeros[j] = new Pasajero(taxi, j + 1);
        }
        for(int i=0; i<5; i++){
            colPasajeros[i].start();
        }
        taxista.start();
    }
}
