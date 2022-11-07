/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP6.Monitores.Ej2;

/**
 *
 * @author jk
 */
public class Jubilado extends Persona{

    public Jubilado(String elTipo, GestorSala unaSala) {
        super(elTipo, unaSala);
    }
    public void run(){
        sala.entrarSalaJubilado(tipo);
        sala.salirSala(tipo);
    }
}
