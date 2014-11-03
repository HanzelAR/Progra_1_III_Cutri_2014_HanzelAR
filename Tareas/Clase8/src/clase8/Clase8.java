/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Clase8 {

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
                    ejercicio1 oejercicio1 = new ejercicio1();
                     for (int i = 0; i < 8; i++) {
                        teclado = new Scanner(System.in);
                  System.out.println("Digite el valor # " + (i + 1));
                        oejercicio1.AgregarValores(teclado.nextInt());
                    } 
         System.out.println("La suma de los valores es:  "+oejercicio1.ImprimirValores());
                      System.out.println(oejercicio1.AcumulaValores());
          System.out.println("Los valores mayores a 50 son: "+oejercicio1.CantidadValores());
                    break;
                  case 2:
                      
          ejercicio2 oejercicio2 = new ejercicio2();
           
        oejercicio2.cargar();
        oejercicio2.sumarizarVectores();
                      break;
                      
                  case 3:
                          ejercicio3 oejercicio3 = new ejercicio3();
                  oejercicio3.cargar();
        oejercicio3.calcularPromedios();
                      break;
                  case 4:
                      ejercicio4 oejercicio4 = new ejercicio4();
                       oejercicio4.cargar();
        oejercicio4.verificarOrdenado(); 
                      break;
                    
            }
           
    }
         while(opcion<5);
        } 
}
