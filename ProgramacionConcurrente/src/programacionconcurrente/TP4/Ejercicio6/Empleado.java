/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP4.Ejercicio6;

/**
 *
 * @author jk
 */
public class Empleado extends Thread {
    int id;
    PollosHermanos resto;

    public Empleado(int id, PollosHermanos resto) {
        this.id = id;
        this.resto = resto;
    }
    
    public void run(){
        resto.pedirComida(id);
        System.out.println("El empleado "+id+" se sienta");
        resto.comer(id);
        System.out.println("El empleado "+id+" esta comiendo");
        resto.terminarComer(id);
        System.out.println("El empelado "+id+" termina de comer");
    }
}
