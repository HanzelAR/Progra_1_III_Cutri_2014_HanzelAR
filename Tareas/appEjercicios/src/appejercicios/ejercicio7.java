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
public class ejercicio7 {

    int c;

    public ejercicio7(int c) {
        this.c = c;
    }

    public boolean positivoNegativo() {
        boolean estado;
        if (c >= 0) {
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }

    public boolean parImpar() {
        boolean estado;
        if (c % 2 == 0) {
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }

    public boolean multiplo5() {
        boolean estado;
        if (c % 5 == 0) {
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }

    public boolean multiplo10() {
        boolean estado;
        if (c % 10 == 0) {
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }

    public boolean mayorMenor100() {
        boolean estado;
        if (c > 100) {
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }

}
