/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {
    int mes,año;
    
    public Ejercicio4(int mes,int año){
     this.mes=mes;
     this.año=año;
    } 
    public int Dias(){
        int dias=0;
     if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
         dias=31;
     }else{
      if(mes==4||mes==6||mes==9||mes==11){
          dias=30;
      }   
     }  
     if(año%4==0&&mes==2){
         dias=29;
     }else{
         dias=28;
     }
     return dias;
    }
}
