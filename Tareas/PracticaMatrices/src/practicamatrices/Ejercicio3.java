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

public class Ejercicio3 {
  private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
           
    public void imprimirVertices() {
    	System.out.println("Vértice superior izquierdo:");
        System.out.println(mat[0][0]);
    	System.out.println("Vértice superior derecho:");        
        System.out.println(mat[0][mat[0].length-1]);
    	System.out.println("Vértice inferior izquierdo:");        
        System.out.println(mat[mat.length-1][0]);
    	System.out.println("Vértice inferior derecho:");        
        System.out.println(mat[mat.length-1][mat[mat.length-1].length-1]);
    }     
}
