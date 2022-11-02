/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP5SemGen.Toboganes;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonard.fernandez
 */
public class Atraccion {
    private int tIzq;
    private int tDer;
    private boolean bajarDer;
    private boolean bajarIzq;
    private Semaphore semAviso;
    private Semaphore puedeBajar;
    private Tobogan toboganIzq;
    private Tobogan toboganDer;
    private Semaphore mutex;
    
    public Atraccion(){
        bajarIzq=false;
        bajarDer=false;
        tIzq=0;
        tDer=0;
        semAviso = new Semaphore(0);
        puedeBajar = new Semaphore(0);
        mutex = new Semaphore(1);
        toboganIzq = new Tobogan();
        toboganDer = new Tobogan();
    }
    
    public void bajar(int visitante){
        try {
            //Metodo utlizado por Visitante
            System.out.println("El visitante "+visitante+" avisa que quiere bajar por el tobogan");
            semAviso.release();
            puedeBajar.acquire();
            mutex.acquire();//Boolean
            if(bajarDer){
                mutex.release();
                toboganDer.bajarTobogan(visitante);
                mutex.acquire();
                tDer--;
                mutex.release();
            }else{
                toboganIzq.bajarTobogan(visitante);
                tIzq--;
            }
        } catch (InterruptedException ex) {Logger.getLogger(Atraccion.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
        public void bajar(int visitante){
        try {
            //Metodo utlizado por Visitante
            System.out.println("El visitante "+visitante+" avisa que quiere bajar por el tobogan");
            semAviso.release();
            puedeBajar.acquire();
            
            
            
            mutex.acquire();//Boolean
            
            String turno = bajarDer; // derecha o izquierda
            
            mutex.release();
            
            mapa.get(turno).getTobogan().bajar();
            
            mutex.acquire();
            
            mapa.get(turno).decrementarCantidad();
            
            mutex.release();
            
            
            
            
            
            if(bajarDer){
                mutex.release();
                toboganDer.bajarTobogan(visitante);
                mutex.acquire();
                tDer--;
                mutex.release();
            }else{
                toboganIzq.bajarTobogan(visitante);
                tIzq--;
            }
        } catch (InterruptedException ex) {Logger.getLogger(Atraccion.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    
    
    
    
    public void permitirBajar(){
        try {
            semAviso.acquire();
            mutex.acquire();
            if(tDer<tIzq){
                System.out.println("El encargado habilito el tobogan derecho");
                toboganDer.habilitarTobogan();
                bajarDer=true;
                tDer++;
            }else{
                System.out.println("El encargado hanbilito el tobogan izquierdo");
                toboganIzq.habilitarTobogan();
                bajarIzq=true;
                tIzq++;
            }
            puedeBajar.release();
            mutex.release();
        } catch (InterruptedException ex) {Logger.getLogger(Atraccion.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
   
}
