/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oScanner=new Scanner(System.in);
        try{
        int contador=0;
        String []vector=new String[5];
        Ejercicio oEjercicio=new Ejercicio(vector);
        while(contador!=5){
            System.out.println("Ingrese la palabra");
            vector[contador]=oScanner.nextLine();
            contador++;
        }
        oEjercicio.Ordenar();
        oEjercicio.mostrar();
        }catch(Exception e){
            
        }
    }
    
}
