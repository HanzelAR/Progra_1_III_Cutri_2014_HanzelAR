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
public class ejercicio2 {

    int X, Y;
    double n, m;

    public ejercicio2(int X, int Y, double n, double m) {
        this.X = X;
        this.Y = Y;
        this.n = n;
        this.m = m;
    }

    public int suma() {
        int suma = 0;
        suma = X + Y;
        return suma;
    }

    public int resta() {
        int resta = 0;
        resta = X - Y;
        return resta;
    }

    public int multiplicacion() {
        int multiplicacion = 0;
        multiplicacion = X * Y;
        return multiplicacion;
    }

    public int division() {
        int division = 0;
        division = X / Y;
        return division;
    }

    public double suma2() {
        double suma2 = 0;
        suma2 = n + m;
        return suma2;
    }

    public double resta2() {
        double resta2 = 0;
        resta2 = n - m;
        return resta2;
    }

    public double multiplicacion2() {
        double multiplicacion2 = 0;
        multiplicacion2 = n * m;
        return multiplicacion2;
    }

    public double division2() {
        double division2 = 0;
        division2 = n / m;
        return division2;
    }
}
