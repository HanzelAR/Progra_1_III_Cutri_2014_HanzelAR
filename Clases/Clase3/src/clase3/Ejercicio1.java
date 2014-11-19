/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    private String numeros = "";

    public Ejercicio1(int numero) {
        this.ImprimirNumeros(numero);
    }

    private String ImprimirNumeros(int numero) {
        for (int i = 0; i < numero; i++) {
            numeros += getNumeros() + i + "";

        }
        return getNumeros();
    }

    //return the numeros
    public String getNumeros() {
        return numeros;
    }
}
