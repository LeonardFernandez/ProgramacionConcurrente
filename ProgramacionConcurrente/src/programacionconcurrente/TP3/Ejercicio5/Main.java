/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP3.Ejercicio5;

/**
 *
 * @author leonard.fernandez
 */
public class Main {
        public static void main(String[] args) {
            Auto[] colAuto = new Auto[5];
            Surtidor surtidor = new Surtidor(100);
            for(int j=0; j<5; j++){
                colAuto[j] = new Auto(j, surtidor, 65);
            }
            for(int j=0; j<5; j++){
                colAuto[j].start();
            }
        }
}
