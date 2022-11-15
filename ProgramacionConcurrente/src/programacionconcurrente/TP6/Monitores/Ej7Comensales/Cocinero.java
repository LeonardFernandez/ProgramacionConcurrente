/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP6.Monitores.Ej7Comensales;

/**
 *
 * @author jk
 */
public class Cocinero extends Thread{
    private Olla olla;
    
    public Cocinero(Olla unaOlla){
        olla=unaOlla;
    }
    
    public void run(){
        while(true){
            olla.cocinar();
        }
    }
}
