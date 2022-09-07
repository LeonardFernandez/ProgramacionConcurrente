/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP3.Ejercicio2;

/**
 *
 * @author jk
 */
public class Vida {
    private int salud=10;
    
    public int obtenerVida(){
        return salud;
    }
    
    public synchronized void modificarSalud(int modificacion){
        salud=salud+modificacion;
    }
}
