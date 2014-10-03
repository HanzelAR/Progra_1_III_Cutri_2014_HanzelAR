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
public class ejercicio5 {

    int H;

    public ejercicio5(int H) {
        this.H = H;

    }

    public boolean parimpar() {
        boolean estado;
        if (H % 2 == 0) {
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }
}
