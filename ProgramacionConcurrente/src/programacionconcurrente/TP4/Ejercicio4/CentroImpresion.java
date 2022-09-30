/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP4.Ejercicio4;
import java.util.concurrent.Semaphore;
/**
 *
 * @author leonard.fernandez
 */
public class CentroImpresion {
    public static void main(String[] args) {
        Impresora[] imp = new Impresora[3];
        Usuario[] colUsuario = new Usuario[5];
        for(int j=0; j<3; j++){
            imp[j]= new Impresora(j);
        }
        for(int j=0; j<5; j++){
            colUsuario[j] = new Usuario(j, imp);
        }
        for(int j=0; j<5; j++){
            colUsuario[j].start();
        }
    }    
}
