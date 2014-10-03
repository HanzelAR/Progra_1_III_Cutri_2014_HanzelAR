/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AppEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N, B, c;
        double A;
        char C;
        int X, Y, E, F, G, H;
        double n, m;
        int O;
        Scanner teclado = new Scanner(System.in);
        System.out.println("******** Ejercicio 1 ********");
        System.out.println("Digite el valor de N");
        N = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de A");
        A = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite una letra para darle el valor a C");
        C = teclado.nextLine().charAt(0);

        ejercicio1 a = new ejercicio1(N, A, C);
        System.out.print("El valor de N es:" + N + "  El valor de A es:" + A + "  El valor de C es:" + C);
        System.out.println("  La suma de N + A es:" + a.suma());
        System.out.println("La diferencia de A - N es:" + a.diferencia());
        System.out.println("El valor numerico de C es:" + a.letra());

        System.out.println("******** Ejercicio 2 ********");

        System.out.println("Digite el valor de X");
        X = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de Y");
        Y = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de n");
        n = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite el valor de m");
        m = Double.parseDouble(teclado.nextLine());

        ejercicio2 b = new ejercicio2(X, Y, n, m);
        System.out.println("La suma de X+Y es:" + b.suma());
        System.out.println("La resta de X-Y es:" + b.resta());
        System.out.println("La multiplicacion de X*Y es:" + b.multiplicacion());
        System.out.println("La division de X/Y es:" + b.division());
        System.out.println("La suma de n+m es:" + b.suma2());
        System.out.println("La resta de n-m es:" + b.resta2());
        System.out.println("La multiplicacion de n*m es:" + b.multiplicacion2());
        System.out.println("La division de n/m es:" + b.division2());

        System.out.println("******** Ejercicio 3 ********");

        System.out.println("Digite el valor de N");
        N = Integer.parseInt(teclado.nextLine());

        ejercicio3 h = new ejercicio3(N);
        System.out.println("La suma de N + 77 es:" + h.incrementa77());
        System.out.println("La resta de N - 3 es:" + h.decrementa3());
        System.out.println("El doble de N es:" + h.duplicar());

        System.out.println("******** Ejercicio 4 ********");

        System.out.println("Digite el valor de E");
        E = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de F");
        F = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de G");
        G = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de H");
        H = Integer.parseInt(teclado.nextLine());

        ejercicio4 d = new ejercicio4(E, F, G, H);
        System.out.println("El nuevo valor de F es:" + d.cambiavalorF());
        System.out.println("El nuevo valor de G es:" + d.cambiavalorG());
        System.out.println("El nuevo valor de E es:" + d.cambiavalorE());
        System.out.println("El nuevo valor de H es:" + d.cambiavalorH());

        System.out.println("******** Ejercicio 5 ********");

        System.out.println("Digite el valor de H");
        H = Integer.parseInt(teclado.nextLine());

        ejercicio5 e = new ejercicio5(H);
        if (e.parimpar() == true) {
            System.out.println("H es par");
        } else {
            System.out.println("H es impar");
        }

        System.out.println("******** Ejercicio 6 ********");

        System.out.println("Digite el valor de B");
        B = Integer.parseInt(teclado.nextLine());

        ejercicio6 f = new ejercicio6(B);
        if (f.positivoNegativo() == true) {
            System.out.println("El valor de B es positivo");
        } else {
            System.out.println("El valor de B es negativo");
        }

        System.out.println("******** Ejercicio 7 ********");

        System.out.println("Digite el valor de c");
        c = Integer.parseInt(teclado.nextLine());

        ejercicio7 s = new ejercicio7(c);
        if (s.positivoNegativo() == true) {
            System.out.println("El valor de c es positivo");
        } else {
            System.out.println("El valor de c es negativo");
        }

        if (s.parImpar() == true) {
            System.out.println("c es par");
        } else {
            System.out.println("c es impar");
        }
        if (s.multiplo5() == true) {
            System.out.println("El valor de c es multiplo de 5");
        } else {
            System.out.println("El valor de c NO es multiplo de 5");
        }
        if (s.multiplo10() == true) {
            System.out.println("El valor de c es multiplo de 10");
        } else {
            System.out.println("El valor de c NO es multiplo de 10");
        }
        if (s.mayorMenor100() == true) {
            System.out.println("El valor de c es MAYOR que 100");
        } else {
            System.out.println("El valor de c es MENOR que 100");
        }
    }
}
