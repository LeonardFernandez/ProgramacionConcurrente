/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente.TP6.Monitores.Ej4Observatorio;

/**
 *
 * @author jk
 */
public class GestorObservatorio {
    private int visitantes;
    private int personal;
    private int investigadores;
    private int sillaR;
    
    public GestorObservatorio(){
        visitantes=0;
        personal=0;
        investigadores=0;
        sillaR=0;
    }
    
    public synchronized void entrarVisitante(){
        while(visitantes>=50 || (visitantes>=30 && sillaR>=1) || (personal>=1) || (investigadores>=1)){
            this.wait();
        }
        visitantes++;
    }
    
    public synchronized void entrarConSilla(){
        while(visitantes>=50 || (personal>=1) || (investigadores>=1)){
            this.wait();
        }
        sillaR++;
        visitantes++;
    }
    
    public synchronized void entrarPersonal(){
        while(visitantes>=1 || investigadores>=1){
            this.wait();
            personal++;
        }
    }
    
    public synchronized void entrarInvestigador(){
        while(visitantes>=1 || personal>=1){
            this.wait();
            investigadores++;
        }
    }
    
    public synchronized void salirSillaR(){
        sillaR--;
    }
    
    public synchronized void salirVisitante(){
        visitantes--;
    }
    
    public synchronized void salirPersonal(){
        personal--;
    }
    
    public synchronized void salirInvestigador(){
        investigadores--;
    }
    
    
}
