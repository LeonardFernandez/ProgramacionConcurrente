/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP4.Ejercicio4;

import java.util.concurrent.Semaphore;

/**
 *
 * @author leonard.fernandez
 */
public class Impresora {
    String nombre;
    Semaphore semaforo = new Semaphore(1);
    
    public Impresora(String unNombre){
        nombre=unNombre;
    }
    
    public void imprimir(int unNombre, int numHoja) throws InterruptedException{
        //adquirir
        semaforo.acquire();
        //liberar
        System.out.println("Usuario "+unNombre+" esta imprimiendo la hoja n° " + numHoja);
        semaforo.release();
    }
    
}
