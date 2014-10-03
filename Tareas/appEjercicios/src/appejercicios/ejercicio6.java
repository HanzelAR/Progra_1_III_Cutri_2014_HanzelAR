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
public class ejercicio6 {

    int B;

    public ejercicio6(int B) {
        this.B = B;

    }

    public boolean positivoNegativo() {
        boolean estado;
        if (B >= 0) {
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }
}
