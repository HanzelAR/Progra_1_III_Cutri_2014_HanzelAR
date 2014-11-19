/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz2;

//Realice un programa que lea 10 números, del 1 al 10 y almacenelos en una lista y muestre
//cuentas veces aparecen los números.
public class NodoNumero {
    int numero=0;
    NodoNumero siguiente;

    public NodoNumero() {
        numero=0;
        siguiente=null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NodoNumero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoNumero siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
