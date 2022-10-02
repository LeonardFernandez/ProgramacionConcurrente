/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP4.Ejercicio6;

/**
 *
 * @author jk
 */
public class Main {
    public static void main(String[] args) {
        Empleado[] colEmpleado = new Empleado[8];
        PollosHermanos resto = new PollosHermanos();
        Mozo mozo = new Mozo("mozo", resto);
        
        for (int i = 0; i < 8; i++) {
            colEmpleado[i] =  new Empleado(i, resto);
        }
        for (int i = 0; i < 8; i++) {
            colEmpleado[i].start();   
        }
        mozo.start();
    }
}
