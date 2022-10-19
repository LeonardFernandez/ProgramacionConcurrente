/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP6.Ej4Tren;

import java.util.concurrent.Semaphore;

/**
 *
 * @author leonard.fernandez
 */
public class Tickets {
    private String[] buffer;
    private int cantComprados;
    private Semaphore semTickets;
    private Semaphore semHayLugar;
    private Semaphore semAvisarPasajero;
    private Semaphore mutex;
    private int capacidad;
    
    public Tickets(int cantTickets){
        buffer = new String[cantTickets];
        cantComprados=0;
        semTickets = new Semaphore(0); //0 permisos
        semHayLugar = new Semaphore(cantTickets);
        semAvisarPasajero = new Semaphore(0);
        mutex = new Semaphore(1); //1 permiso
        capacidad=cantTickets;
    } 
    
    public void subirse() throws InterruptedException{
        //Metodo para pasajeros
        semHayLugar.acquire();
        mutex.acquire();
        buffer[cantComprados]="Ticket Vendido";
        cantComprados++;
        semTickets.release();
        mutex.release();
    }
    
    public void bajarse() throws InterruptedException{
        semAvisarPasajero.acquire();
        mutex.acquire();
        semHayLugar.release();
        buffer[cantComprados]=null;
        cantComprados--;
        mutex.release();
    }
    
    public void iniciarViaje() throws InterruptedException{
        semTickets.acquire(capacidad);
        mutex.acquire();
        Thread.sleep(3000); //Viajando
        mutex.release();
    }
    
    public void finalizarViaje() throws InterruptedException{
        mutex.acquire();
        semAvisarPasajero.release(capacidad); //visa a los pasajeros que pueden bajarse
        mutex.release();
    }
}
