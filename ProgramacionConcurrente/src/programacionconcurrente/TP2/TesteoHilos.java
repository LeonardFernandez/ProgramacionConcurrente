/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonard.fernandez
 */
class TesteoHilos {

    public static void main(String[] args) {
        Thread hilo=new Thread(new ThreadEjemplo2(), "efe");
        hilo.start();
        System.out.println("Termina thread main");
    }
}
