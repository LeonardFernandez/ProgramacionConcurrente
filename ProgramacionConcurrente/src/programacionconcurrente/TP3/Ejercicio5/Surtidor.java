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
public class Surtidor {

    private int combustibleDisponible;

    public Surtidor(int cantCombustible) {
        combustibleDisponible = cantCombustible;
    }

    public synchronized int cargarNafta(int combustACargar) {
        int combustibleCargado = 0;
        if (combustibleDisponible >= combustACargar) {
            combustibleDisponible = combustibleDisponible - combustACargar;
            combustibleCargado = combustACargar;
        }
        return combustibleCargado;
    }
}
