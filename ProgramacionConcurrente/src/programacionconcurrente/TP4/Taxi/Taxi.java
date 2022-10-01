/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP4.Taxi;

import java.util.concurrent.Semaphore;

/**
 *
 * @author jk
 */
public class Taxi {
    //SemTaxiLibre y SemSubePasajero son semaforos para la comunicacion de los hilos
    //semPuedeBajar es un semaforo de exclusion mutua
    Semaphore semTaxiLibre = new Semaphore(1);
    Semaphore semSubePasajero = new Semaphore(0);
    Semaphore semPuedeBajar = new Semaphore(0);
    
    public void subirse() throws InterruptedException{
        //Metodo que utiliza el hilo Pasajero
        semTaxiLibre.acquire();
        //Despierta al taxista
        semSubePasajero.release();
    }
    
    public void viajar() throws InterruptedException{
        //Metodo que utiliza el taxista para tomar el viaje
        //El taxista toma el viaje
        System.out.println("Taxista toma el viaje");
        semSubePasajero.acquire();
        //Simulo tiempo de viaje
        System.out.println("Viajando");
        Thread.sleep(3000);
        //Le indica al pasajero que puede bajarse
        System.out.println("El viaje finaliza");
        semPuedeBajar.release();
    }
    
    public void bajarse() throws InterruptedException{
        //Pasajero se baja
        semPuedeBajar.acquire();
        //El taxi queda libre
        semTaxiLibre.release();
    }
}
