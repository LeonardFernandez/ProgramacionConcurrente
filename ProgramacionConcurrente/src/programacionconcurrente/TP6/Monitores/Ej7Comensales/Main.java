/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP6.Monitores.Ej7Comensales;

/**
 *
 * @author jk
 */
public class Main {
    public static void main(String[] args) {
        Olla olla = new Olla(7);
        Cocinero cocinero = new Cocinero(olla);
        Canibal[] colCanibal = new Canibal[4];
        for (int i = 0; i < colCanibal.length; i++) {
            colCanibal[i]=new Canibal(i+1, olla);
            
        }
        for (int i = 0; i < colCanibal.length; i++) {
            colCanibal[i].start();
            
        }
        cocinero.start();
    }
}
