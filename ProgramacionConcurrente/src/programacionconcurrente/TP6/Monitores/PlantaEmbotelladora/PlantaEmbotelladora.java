/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP6.Monitores.PlantaEmbotelladora;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author jk
 */
public class PlantaEmbotelladora {
    private Lock cerrojo = new ReentrantLock();
    private Condition hayLugarAgua=cerrojo.newCondition();
    private Condition hayLugarVino=cerrojo.newCondition();
    private Condition cajaLlena=cerrojo.newCondition();
    private int cantAgua;
    private int cantVino;
    
    public void embotellarAgua(){
        cerrojo.lock();
        while(cantAgua>=10){
            hayLugarAgua.await();
        }
        System.out.println("Embotellando Agua");
        cerrojo.unlock();
    }
    
    public void terminarEmbotellarAgua(){
        cerrojo.lock();
        System.out.println("Agua Embotellada");
        cantAgua++;
        cerrojo.unlock();
    }
    
    public void empaquetar(){
        cerrojo.lock();
        while(cantAgua<10 || cantVino<10){
            cajaLlena.await();
        }
        if(cantAgua>=10){
            cantAgua=0; hayLugarAgua.signal();
        }else{
            cantVino=0; hayLugarVino.signal();
        }
        cerrojo.unlock();
    }
}
