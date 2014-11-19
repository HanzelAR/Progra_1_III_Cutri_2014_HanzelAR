/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practialistas1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PractiaListas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner scanner=new Scanner(System.in);
        System.out.println("Digite la cantidad de palabras a insertar");
        int cantidad=scanner.nextInt();
        ListaPalabras listaPalabras=new ListaPalabras();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Inserte la palabra "+(i+1));
            scanner=new Scanner(System.in);
            String palabra=scanner.nextLine();
            NodoPalabras oNodoPalabras=new NodoPalabras();
            oNodoPalabras.setPalabra(palabra);
            if(listaPalabras.Duplicado(palabra))
            {
                 System.out.println("Palabra duplicada");
                 i--;
            }
            else
            {
                listaPalabras.Insertar(oNodoPalabras);
            }           
        }
        System.out.println(listaPalabras.Imprimir());
    }
    
    }
    

