/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP3.Ejercicio2;

/**
 *
 * @author jk
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Vida saludPersonaje = new Vida();
        Curandero elCurandero = new Curandero(saludPersonaje);
        Orco elOrco = new Orco(saludPersonaje);
        System.out.println("La salud actual es → " + saludPersonaje.obtenerVida());
        elOrco.start();
        elCurandero.start();
        elOrco.join();
        elCurandero.join();
        System.out.println("La salud final del personaje es → " + saludPersonaje.obtenerVida());
    }
}
