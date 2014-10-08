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
public class Ejercicio6 {
    
 int dia,mes,año;
   
   public Ejercicio6(int dia,int mes,int año){
       this.dia=dia;
       this.mes=mes;
       this.año=año;
   }
    public String anterior(){
        String tabla=" ";int ndia=0,nmes=0,naño=0;
          if(dia==1&&mes==1){
         ndia=31;
         nmes=12; naño=año-1;
     }else{
              if(dia==1&&mes==2){
                  ndia=31;
                  nmes=1;naño=año;
              }
          } 
          
     if(año%4==0&&dia==1&&mes==3){
         ndia=29;
         nmes=2;naño=año;
     }else{
         if(dia==1&&mes==3){
             
           ndia=28;
         nmes=2;naño=año;
         }
     }
     if(dia==1&&mes==4){
         ndia=31; nmes=3;naño=año;
     }else{
         if(dia==1&&mes==5){
             ndia=30; nmes=4;naño=año;
         }
     }
     if(dia==1&&mes==6){
         ndia=31; nmes=5;naño=año;
     }else{
         if(dia==1&&mes==7){
             ndia=30;
             nmes=6;naño=año;
         }
     }
     if(dia==1&&mes==8){
         ndia=31; nmes=7;naño=año;
     }else{
         if(dia==1&&mes==9){
             ndia=31;nmes=8;naño=año;
         }
     }
     if(dia==1&&mes==10){
         ndia=30;nmes=9;naño=año;
     }else{
         if(dia==1&&mes==11){
             ndia=31;nmes=10;naño=año;
         }
     }
     if(dia==1&&mes==12){
         ndia=30;nmes=11;naño=año;
     }
      
        tabla= ndia + "-" + nmes + "-" + naño;
        return tabla;
    }   
   
}
