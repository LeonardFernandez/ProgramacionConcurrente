/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP6.Monitores.Ej2;

/**
 *
 * @author jk
 */
public class Persona extends Thread{
    protected String tipo;
    protected GestorSala sala;
    public Persona(String elTipo, GestorSala unaSala){
        tipo=elTipo;
        sala=unaSala;
    }
    
    public void run(){
        sala.entrarSala(tipo);
        sala.salirSala(tipo);
    }
    
}
