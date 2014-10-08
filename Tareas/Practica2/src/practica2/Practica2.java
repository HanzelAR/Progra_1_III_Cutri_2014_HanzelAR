/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,mes,año,dia,N;
        int opcion = 0;
        boolean validar = true;
        char continuar;
char letra;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite el ejercicio a ejecutar");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");


            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {

                case 1:
                    System.out.println("Digite el valor de num");
                    num = Integer.parseInt(teclado.nextLine());
                    Ejercicio1 a = new Ejercicio1(num);
                    if (a.meses() == 1) {
                        System.out.println("El mes es Enero");
                    } else {
                        if (a.meses() == 2) {
                            System.out.println("El mes es Febrero");
                        }
                    }
                    if (a.meses() == 3) {
                        System.out.println("El mes es Marzo");
                    } else {
                        if (a.meses() == 4) {
                            System.out.println("El mes es Abril");
                        }
                    }
                    if (a.meses() == 5) {
                        System.out.println("El mes es Mayo");
                    } else {
                        if (a.meses() == 6) {
                            System.out.println("El mes es Junio");
                        }
                    }
                    if (a.meses() == 7) {
                        System.out.println("El mes es Julio");
                    } else {
                        if (a.meses() == 8) {
                            System.out.println("El mes es Agosto");
                        }
                    }
                    if (a.meses() == 9) {
                        System.out.println("El mes es Setiembre");
                    } else {
                        if (a.meses() == 10) {
                            System.out.println("El mes es Octubre");
                        }
                    }
                    if (a.meses() == 11) {
                        System.out.println("El mes es Noviembre");
                    } else {
                        if (a.meses() == 12) {
                            System.out.println("El mes es Diciembre");

                        }
                    }
                    break;
                   
                case 2:
                    System.out.println("Digite un número");
                    N=Integer.parseInt(teclado.nextLine());
                    Ejercicio2 b=new Ejercicio2(N);
                    System.out.println(b.evalua());
                    break;
                    
                case 3:
                    System.out.println("Digite una letra que este entre a y e");
                    letra=teclado.nextLine().charAt(0);
                    Ejercicio3 c=new Ejercicio3(letra);
                    if(c.Calificacion()=='a'||letra=='A'){
                        System.out.println("Excelente");
                    }else{
                  if(c.Calificacion()=='b'||letra=='B'){
                      System.out.println("Bueno");  
                  }      
                    }
                     if(c.Calificacion()=='c'||letra=='C'){
                        System.out.println("Regular");
                    }else{
                  if(c.Calificacion()=='d'||letra=='D'){
                      System.out.println("Malo");  
                  }      
                    } 
                       if(c.Calificacion()=='e'||letra=='E'){
                        System.out.println("Pésimo");
                    }
                    break;
                    
                case 4:
                    System.out.println("Digite el mes");
                    mes=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el año");
                    año=Integer.parseInt(teclado.nextLine());
                    Ejercicio4 d=new Ejercicio4(mes, año);
                    if(d.Dias()==31){
                        System.out.println("El mes tiene 31 dias");
                    }else{
                if(d.Dias()==30){
                    System.out.println("El mes tiene 30 dias");
                }        
                    }
                if(d.Dias()==29){
                    System.out.println("El mes tiene 29 dias");
                }else{
                    System.out.println("El mes tiene 28 dias");
                }
                break;
                    
                case 5:
                    
                    break;
                    
                case 6:
                    System.out.println("Digite el dia");         
                    dia=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el mes");
                    mes=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el año");
                    año=Integer.parseInt(teclado.nextLine());
                    Ejercicio6 e=new Ejercicio6(dia,mes, año);
System.out.println("El día anterior a esta fecha  "  +e.dia+"-"+e.mes+"-"+e.año +"  es:"
        +'\n'+  e.anterior());
                    break;
                    
                case 7:
                    
                    break;
              default:
                  break;
            }
            System.out.println("Desea continuar con otra operacion S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;

            } else {
                validar = false;
            }
        } while (validar);
    }
}
