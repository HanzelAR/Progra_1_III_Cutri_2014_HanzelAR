/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatrices;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ejercicio1 {
   private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        mat=new int[2][5];
        System.out.println("Carga de la matriz por columna:");
        for(int c=0;c<5;c++) {        
           for(int f=0;f<2;f++) {
                System.out.print("Ingrese componente " + " de la fila " + f + " y la columna "+ c + " :");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<2;f++) {
            for(int c=0;c<5;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
}
