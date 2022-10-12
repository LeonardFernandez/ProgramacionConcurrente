/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP6.ProductorConsumidor;

/**
 *
 * @author leonard.fernandez
 */
public class Main {
    public static void main(String[] args) {
        Productos colProductos = new Productos(5);
        Productor[] productor = new Productor[3];
        Consumidor[] consumidor = new Consumidor[5];
        for (int i = 0; i < consumidor.length; i++) {
            consumidor[i]=new Consumidor(colProductos, i);  
        }
        for (int i = 0; i <productor.length; i++) {
            productor[i]=new Productor(colProductos, i);
        }
        for (int i = 0; i < consumidor.length; i++) {
            consumidor[i].start();  
        }
        for (int i = 0; i <productor.length; i++) {
            productor[i].start();
        }
    }
}
