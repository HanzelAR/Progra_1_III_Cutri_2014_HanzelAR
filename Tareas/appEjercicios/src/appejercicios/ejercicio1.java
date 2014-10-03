/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appejercicios;

/**
 *
 * @author Usuario
 */
public class ejercicio1 {

    int N;
    double A;
    char C;

    public ejercicio1(int N, double A, char C) {
        this.N = N;
        this.A = A;
        this.C = C;

    }

    public double suma() {
        double suma = 0;
        suma = N + A;
        return suma;
    }

    public double diferencia() {
        double resta = 0;
        resta = A - N;
        return resta;
    }

    public int letra() {
        int letra;
        letra = C;
        return letra;
    }
}
