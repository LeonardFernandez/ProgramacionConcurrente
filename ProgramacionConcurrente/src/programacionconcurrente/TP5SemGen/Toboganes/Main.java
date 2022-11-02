/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP5SemGen.Toboganes;

/**
 *
 * @author leonard.fernandez
 */
public class Main {
    public static void main(String[] args) {
        Atraccion atraccion = new Atraccion();
        Escalera escalera = new Escalera(5);
        Encargado encargado = new Encargado(escalera,atraccion);
        Visitante[] colVisitante = new Visitante[7];
        for (int i = 0; i < colVisitante.length; i++) {
            colVisitante[i] = new Visitante(escalera,atraccion,i);
        }
        for (int i = 0; i < colVisitante.length; i++) {
            colVisitante[i].start();
        }
        encargado.start();
    }
}
