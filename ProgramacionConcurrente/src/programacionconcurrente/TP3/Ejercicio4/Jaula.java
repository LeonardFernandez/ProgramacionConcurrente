/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP3.Ejercicio4;

/**
 *
 * @author leonard.fernandez
 */
public class Jaula {
    public static void main(String[] args) throws InterruptedException {
        Actividad Plato = new Actividad("comer");
        Actividad Rueda = new Actividad("hacer ejercicio");
        Actividad Hamaca = new Actividad("descansar");
        Hamster[] colHamster = new Hamster[8];
        for(int j=0; j<8; j++){
            colHamster[j] = new Hamster(String.valueOf(j) ,Plato,Rueda,Hamaca);
        }
        for(int j=0; j<8; j++){
            colHamster[j].start();
        }
    }
    
}
