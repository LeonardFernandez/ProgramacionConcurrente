/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente.TP1;
import java.util.Scanner;
/**
 *
 * @author leonard.fernandez
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int edad = 5;
        if(edad<18){
            throw new Exception("Es menor de edad");
        }
    }
    
    public static int ingresarEdad(){
        /*Escriba un método que ingrese la edad de una persona y dispare una
    excepción si la persona es menor de edad.*/
        Scanner sc = new Scanner(System.in);
        int edad=0;
        System.out.println("Ingrese su edad");
        edad= sc.nextInt();
        return edad;
    }
    
}
