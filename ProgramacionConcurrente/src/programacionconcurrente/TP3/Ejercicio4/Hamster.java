/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP3.Ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonard.fernandez
 */
public class Hamster extends Thread {

    private String nombre;
    private Actividad actv1;
    private Actividad actv2;
    private Actividad actv3;

    public Hamster(String n, Actividad a, Actividad b, Actividad c) {
        nombre = n;
        actv1 = a;
        actv2 = b;
        actv3 = c;
    }

    public void realizarActividades() throws InterruptedException {
        //Interprete que las actividades deben hacerse una detras de otra
        //Actividad 1
        while (!actv1.getEnUso()) {
            actv1.usar();
            System.out.println("El hamster " + nombre + " ha comenzado ha relizar la Actividad " + actv1.getNombre());
            Thread.sleep(1000);
            actv1.dejarDeUsar();
            System.out.println("El hamster " + nombre + " ha dejado de relizar la Actividad " + actv1.getNombre());
        }
        //Actividad 2
        while (!actv2.getEnUso()) {
            actv2.usar();
            System.out.println("El hamster " + nombre + " ha comenzado ha relizar la Actividad " + actv2.getNombre());
            Thread.sleep(1000);
            actv2.dejarDeUsar();
            System.out.println("El hamster " + nombre + " ha dejado de relizar la Actividad " + actv2.getNombre());
        }
        //Actividad 3
        while (!actv3.getEnUso()) {
            actv3.usar();
            System.out.println("El hamster " + nombre + " ha comenzado ha relizar la Actividad " + actv3.getNombre());
            Thread.sleep(1000);
            actv3.dejarDeUsar();
            System.out.println("El hamster " + nombre + " ha dejado de relizar la Actividad " + actv3.getNombre());
        }
    }

    public void run() {
        for (int j = 0; j <= 3; j++) {
            try {
                realizarActividades();
            } catch (InterruptedException ex) {
                Logger.getLogger(Hamster.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
