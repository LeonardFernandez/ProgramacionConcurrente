/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP3.Ejercicio5;

/**
 *
 * @author leonard.fernandez
 */
public class Auto extends Thread {

    private String patente;
    private int num;
    private Surtidor surtidor;
    private String marca;
    private int combustibleDisponible;

    public Auto(int unNum,Surtidor unSurt,int cantCombustible) {
        num=unNum;
        surtidor=unSurt;
        combustibleDisponible=cantCombustible;
    }

    public boolean andar(int combustibleConsumido) {
        boolean esPosible = false;
        chequearCombustible();
        if (combustibleDisponible >= combustibleConsumido) {
            combustibleDisponible = combustibleDisponible - combustibleConsumido;
            esPosible=true;
            System.out.println("Vehiculo : "+ num + " consumio " + combustibleConsumido + " litros de nafta");
        }
        return esPosible;
    }

    public void chequearCombustible(){
        //La reserva son 5 litros
        if(combustibleDisponible<=5){
            if(surtidor.cargarNafta(25)!=0){
                combustibleDisponible=combustibleDisponible+25;
                System.out.println("El vehiculo " + num + " cargo 25L de combustible");
            }else{
                System.out.println("No hay combustible disponible para cargar. Vehiculo : " + num);
            }
        }
    }
    
    public void run(){
        for(int j=0; j<=5; j++){
            andar(10);
        }
    }
}
