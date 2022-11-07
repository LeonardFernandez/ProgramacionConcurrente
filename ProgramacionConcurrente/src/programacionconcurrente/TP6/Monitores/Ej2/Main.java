/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP6.Monitores.Ej2;

/**
 *
 * @author jk
 */
public class Main {
    public static void main(String[] args) {
        Persona[] colPersona = new Persona[7];
        Jubilado[] colJubilado = new Jubilado[4];
        GestorSala sala = new GestorSala(20);
        for (int i = 0; i < colJubilado.length; i++) {
            colJubilado[i]=new Jubilado("jubilado "+Integer.toString(i),sala);
            
        }
        for (int i = 0; i < colJubilado.length; i++) {
            colJubilado[i].start();
            
        }
        for (int i = 0; i < colPersona.length; i++) {
            colPersona[i]=new Persona("visitante "+Integer.toString(i),sala);
            
        }
        for (int i = 0; i < colPersona.length; i++) {
            colPersona[i].start();
            
        }
        
    }
}
