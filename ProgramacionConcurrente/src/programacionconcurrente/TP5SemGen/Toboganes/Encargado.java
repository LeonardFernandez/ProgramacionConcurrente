/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP5SemGen.Toboganes;

/**
 *
 * @author leonard.fernandez
 */
public class Encargado extends Thread{
    private Escalera escalera;
    private Atraccion atraccion;
    
    public Encargado(Escalera unaEsc, Atraccion unaAtraccion){
        escalera = unaEsc;
        atraccion = unaAtraccion;
    }
    public void run(){
        while(true){
            escalera.accesoAtraccion();
            atraccion.permitirBajar();
        }
    }
    
}
