/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP5SemGen.Taxi;

import java.util.concurrent.Semaphore;

/**
 *
 * @author leonard.fernandez
 */
public class Taxi {
    //Problema sin buffer, solo semaforos genericos
    //Dos pasajeros pueden subirse en un mismo viaje
    int asientosOcupados;
    private int maxPasajeros;
    Semaphore semTaxiLibre;
    Semaphore semTaxiCompleto;
    Semaphore semPuedenBajar;
    
    public Taxi(int limitePasajeros){
        asientosOcupados=0;
        maxPasajeros=limitePasajeros;
        semTaxiLibre= new Semaphore(2);
        semTaxiCompleto = new Semaphore(0);
        semPuedenBajar= new Semaphore(0);
    }
    
    public void subirse() throws InterruptedException{
        semTaxiLibre.acquire();
        if(asientosOcupados==maxPasajeros){
            semTaxiCompleto.release();
        }
    }
    
    public void comenzarViaje() throws InterruptedException{
        semTaxiCompleto.acquire();
        Thread.sleep(3500); //Viajan
        semPuedenBajar.release(2); //Viaje termino pueden bajarse
    }
    
    public void bajarse() throws InterruptedException{
        semPuedenBajar.acquire(); //Pasajero se baja
        semTaxiLibre.release();
    }
}
