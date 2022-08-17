/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc;

/**
 *
 * @author jk
 */
public class PC {

    /**
     * Ejercicio 6
     */
    public static double acceso_por_indice(double[] v, int j)
            throws RuntimeException {

        try {
            if ((0 <= j) && (j <= v.length)) {
                return v[j];
            } else {
                throw new RuntimeException("El indice " + j + " no existe en el vector");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }
// Desde el siguiente cliente “main”:

    public static void main(String[] args) {
        double[] v = new double[15];
        acceso_por_indice(v, 16);
    }

}
