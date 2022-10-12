/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP6.ProductorConsumidor;

import java.util.concurrent.Semaphore;

/**
 *
 * @author leonard.fernandez
 */
public class Productos {

    private String[] buffer;
    private Semaphore semHayProducto;
    private Semaphore semHayLugar;
    private Semaphore mutex;
    private int cantProductos;

    public Productos(int limite) {
        buffer = new String[limite];
        semHayProducto = new Semaphore(0);
        semHayLugar = new Semaphore(limite);
        mutex = new Semaphore(1);
        cantProductos = 0;
    }

    public void consumir(int consumidor) throws InterruptedException{
        semHayProducto.acquire();
        mutex.acquire();
        buffer[cantProductos]=null;
        cantProductos--;
        semHayLugar.release();
        System.out.println("El consumidor "+consumidor+" consumio un producto");
        Thread.sleep(2000);
        mutex.release();
    }
    
    public void generar(int productor) throws InterruptedException{
        semHayLugar.acquire();
        mutex.acquire();
        buffer[cantProductos]="nuevoProduct";
        cantProductos++;
        semHayProducto.release();
        System.out.println("El productor "+productor+" produjo un nuevo producto");
        Thread.sleep(2000);
        mutex.release();
    }
    
    
}
