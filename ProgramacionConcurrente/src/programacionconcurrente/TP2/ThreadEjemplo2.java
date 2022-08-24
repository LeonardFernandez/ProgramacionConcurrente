/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP2;

/**
 *
 * @author leonard.fernandez
 */
public class ThreadEjemplo2 implements Runnable {
    private String name;
    
    public ThreadEjemplo2(){
        
    }
    public ThreadEjemplo2(String str){
        name=str;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        System.out.println("Termina thread " + Thread.currentThread().getName());
    }
}
