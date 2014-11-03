/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class ejercicio2 {
   private Scanner teclado;
   
    private int[] vec1;
    private int[] vec2;
    private int[] vecSuma;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        vec1=new int[4];
        vec2=new int[4];
        System.out.println("Carga del primer vector.");
        for(int f=0;f<4;f++) {
            System.out.print("Ingrese elemento:");
            vec1[f]=teclado.nextInt();
        }
        System.out.println("Carga del segundo vector.");
        for(int f=0;f<4;f++) {
            System.out.print("Ingrese elemento:");
            vec2[f]=teclado.nextInt();
        }        
    }    
    
    public void sumarizarVectores() {
    	vecSuma=new int[4];
        for(int f=0;f<4;f++) {
            vecSuma[f]=vec1[f]+vec2[f];
        }
        System.out.println("Vector resultante.");
        for(int f=0;f<4;f++) {
            System.out.println(vecSuma[f]);
        }
    }
    }
         

