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
public class Ejercicio3 {
    char letra;
    
    public Ejercicio3(char letra){
        this.letra=letra;
    }
    public char Calificacion(){
    if(letra=='a'||letra=='A'){
        letra=letra;
    }else{
     if(letra=='b'||letra=='B'){
         letra=letra;
     }   
    }
    if(letra=='c'||letra=='C'){
        letra=letra;
    }else{
        if(letra=='d'||letra=='D'){
            letra=letra;
        }
    }
    if(letra=='e'||letra=='E'){
        letra=letra;
    }
    return letra;
    }
}

