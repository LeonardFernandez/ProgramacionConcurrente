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
public class Orco extends Thread{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    Vida salud;
    
    public Orco(Vida vida){
        salud=vida;
    }
    
    private void quitarSalud(){
        System.out.println(ANSI_RED + "El orco esta atancandote"+ ANSI_RESET);
        salud.modificarSalud(-3);
        System.out.println(ANSI_RED + "El orco te quito 3 de salud" + ANSI_RESET);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Curandero.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    public void run(){
        for(int j=0; j<=34; j++){
            //System.out.println("La salud actual es → " + salud.obtenerVida());
            quitarSalud();
            System.out.println("La salud actual es → " + salud.obtenerVida());
        }
    }
}
