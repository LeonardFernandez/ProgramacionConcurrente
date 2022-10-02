/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP4.Ejercicio6;

/**
 *
 * @author jk
 */
public class Mozo extends Thread{
    String nombre;
    PollosHermanos resto;

    public Mozo(String nombre, PollosHermanos resto) {
        this.nombre = nombre;
        this.resto = resto;
    }
    
    public void run(){
        for (int i = 0; i < 8; i++) { //Suponemos que el mozo esta jornada tomara 8 pedidos
            
            resto.tomarPedido();
            System.out.println("El mozo toma el pedido");
        }
    }
}
