/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatrices;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PracticaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();
            switch (opcion){
                  case 1:
                          Ejercicio1 a=new Ejercicio1();
        a.cargar();
        a.imprimir();
                      break;

                  case 2:
                      
                    Ejercicio2 b=new Ejercicio2();
        b.cargar();
        b.intercambiar();
        b.imprimir(); 
                      break;
                  case 3:
                  Ejercicio3 c=new Ejercicio3();
        c.cargar();
        c.imprimirVertices();
                      break;
                  case 4:
                     Ejercicio4 d=new Ejercicio4();
        d.cargar();
        d.imprimirMayor();  
                      break;
            }
           
    }
         while(opcion<5);
        } 
    }
