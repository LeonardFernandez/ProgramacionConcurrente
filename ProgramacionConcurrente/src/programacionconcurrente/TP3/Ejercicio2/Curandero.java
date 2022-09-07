/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP3.Ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jk
 */
public class Curandero extends Thread {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    Vida salud;

    public Curandero(Vida vida) {
        salud = vida;
    }

    private void curar() {
        System.out.println(ANSI_GREEN + "El curandero esta curandote" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "El curandero te sumo 3 de vida" + ANSI_RESET);
        salud.modificarSalud(3);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Curandero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        for (int j = 0; j <= 3; j++) {
            //System.out.println("La salud actual es → " + salud.obtenerVida());
            curar();
            System.out.println("La salud actual es → " + salud.obtenerVida());
        }
    }
}
