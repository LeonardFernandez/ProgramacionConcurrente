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
public class Visitante extends Thread{
    private Escalera escalera;
    private Atraccion atraccion;
    private int id;
    
    public Visitante(Escalera unaEsc, Atraccion unaAtraccion, int unId){
        escalera = unaEsc;
        atraccion = unaAtraccion;
        id=unId;
    }
    
    public void run(){
        escalera.subirEscalera();
        atraccion.bajar(id);
    }
}
