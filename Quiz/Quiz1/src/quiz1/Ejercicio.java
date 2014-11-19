/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Usuario
 */
public class Ejercicio {

    private String vector[];
     String abecedario = "ABCDEFGHIJLMNOPQRSTUVWXYZ";


    public Ejercicio(String vector[]) {
        this.vector = vector;
    }

    public void Ordenar() {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length && i != j; j++) {
                if (vector[i].compareToIgnoreCase(vector[j]) < 0) {
                    String aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            
            if(vector[i]==abecedario){
                String aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux; 
            }
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }
}
